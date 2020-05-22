package org.yangsibao.vhr.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/12-18:12
 */
@Data
public class Hr implements UserDetails {

    private Integer id;

    private String name;

    private String phone;

    private String telephone;

    private String address;

    private Boolean state;

    private String username;

    private String password;

    private String userface;

    private String remark;

    private List<Role> roles;

    // 将本hr对应的role遍历，并赋予一个GrantedAhthority的实现类的集合中，此集合对象保存该hr的所有授权
    @Override
    @JsonIgnore//此字段不要返回去
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>(roles.size());
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
