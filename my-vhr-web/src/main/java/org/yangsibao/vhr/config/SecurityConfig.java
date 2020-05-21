package org.yangsibao.vhr.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.*;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.yangsibao.vhr.model.Hr;
import org.yangsibao.vhr.model.RespBean;
import org.yangsibao.vhr.service.HrService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author yangsibao
 * @date 2020/5/12-14:44
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private HrService hrService;

    @Autowired
    private CustomUrlDecisionManager customUrlDecisionManager;

    @Autowired
    private CustomFilterInvocationSecurityMetadataSource customFilterInvocationSecurityMetadataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(hrService);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        //忽略
        web.ignoring().antMatchers("/css/**", "/js/**", "/index.html", "/img/**", "/fonts/**", "/favicon.ico");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>() {
//                    @Override
//                    public <O extends FilterSecurityInterceptor> O postProcess(O object) {
//                        object.setAccessDecisionManager(customUrlDecisionManager);
//                        object.setSecurityMetadataSource(customFilterInvocationSecurityMetadataSource);
//                        return object;
//                    }
//                })
//                .and()
//                // 为什么加了.logout()就不需要anyRequest()了？
//                .logout()
//                .logoutSuccessHandler(new LogoutSuccessHandler() {
//                    @Override
//                    public void onLogoutSuccess(HttpServletRequest req, HttpServletResponse resp, Authentication authentication) throws IOException, ServletException {
//                        resp.setContentType("application/json;charset=utf-8");
//                        PrintWriter out = resp.getWriter();
//                        out.write(new ObjectMapper().writeValueAsString(RespBean.ok("注销成功!")));
//                        out.flush();
//                        out.close();
//                    }
//                })
//                .permitAll()
//                .and()
//                .csrf().disable()
//                .exceptionHandling()
//                .authenticationEntryPoint(new AuthenticationEntryPoint() {
//                    @Override
//                    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
//                        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
//                        response.setStatus(401);
//                        PrintWriter out = response.getWriter();
//                        RespBean respBean = RespBean.error("访问失败");
//                        if (authException instanceof InsufficientAuthenticationException) {
//                            respBean.setMsg("请求失败，请联系管理员!");
//                        }
//                        out.write(new ObjectMapper().writeValueAsString(respBean));
//                        out.flush();
//                        out.close();
//                    }
//                });
//        http.addFilterAt(loginFilter(), UsernamePasswordAuthenticationFilter.class);

        http.authorizeRequests()//开启登陆配置
                .antMatchers("/hello").hasRole("admin")//表示访问 /hello 这个接口，需要具备 admin 这个角色
                .anyRequest().authenticated()//表示剩余的其他接口，登录之后就能访问
                .and()//结束符
//                .withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>() {
//                    @Override
//                    public <O extends FilterSecurityInterceptor> O postProcess(O object) {
//                        object.setAccessDecisionManager(customUrlDecisionManager);
//                        object.setSecurityMetadataSource(customFilterInvocationSecurityMetadataSource);
//                        return object;
//                    }
//                })
//                .and()
                .formLogin()
                .loginPage("/login.html")//定义登录页面，未登录时，访问一个需要登录之后才能访问的接口，会自动跳转到该页面
                .loginProcessingUrl("/doLogin")//登录处理接口
                .successHandler(new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
                        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
                        PrintWriter out = response.getWriter();
                        Hr hr = (Hr) authentication.getPrincipal();
                        hr.setPassword(null);
                        RespBean respBean = RespBean.ok("登录成功", hr);
                        out.write(new ObjectMapper().writeValueAsString(respBean));
                        out.flush();
                        out.close();

                    }
                })
                .failureHandler(new AuthenticationFailureHandler() {
                    @Override
                    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
                        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
                        PrintWriter out = response.getWriter();
                        RespBean respBean = RespBean.error(exception.getMessage());
                        if (exception instanceof LockedException) {
                            respBean.setMsg("账户被锁定");
                        } else if (exception instanceof CredentialsExpiredException) {
                            respBean.setMsg("密码过期!");
                        } else if (exception instanceof AccountExpiredException) {
                            respBean.setMsg("账户过期!");
                        } else if (exception instanceof DisabledException) {
                            respBean.setMsg("账户被禁用!");
                        } else if (exception instanceof BadCredentialsException) {
                            respBean.setMsg("用户名或者密码输入错误，请重新输入!");
                        }
                        out.write(new ObjectMapper().writeValueAsString(respBean));
                        out.flush();
                        out.close();
                    }
                })
                .permitAll()//和表单登录相关的接口统统都直接通过
                .and()
                .csrf().disable();

    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
