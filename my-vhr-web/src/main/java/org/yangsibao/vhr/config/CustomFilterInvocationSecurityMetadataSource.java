package org.yangsibao.vhr.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.yangsibao.vhr.model.Menu;
import org.yangsibao.vhr.model.Role;
import org.yangsibao.vhr.service.MenuService;

import java.util.Collection;
import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/20-18:53
 */
@Component
public class CustomFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
    @Autowired
    private MenuService menuService;

    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation) object).getRequestUrl();
        List<Menu> menus = menuService.getAllMenusWithRole();
        for (Menu menu : menus) {
            if (antPathMatcher.match(menu.getUrl(), requestUrl)) {
                List<Role> roles = menu.getRoles();
                String[] str = new String[roles.size()];
                for (int i = 0; i < roles.size(); i++) {
                    str[i] = roles.get(i).getName();
                }
                return SecurityConfig.createList(str);
            }
        }
        //无论匹配与否，都要认证LOGIN角色，也就是说，都要认证是否登录
        return SecurityConfig.createList("ROLE_LOGIN");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }
}
