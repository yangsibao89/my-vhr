package org.yangsibao.vhr.model;

import lombok.Data;

import javax.management.relation.Role;
import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/12-18:12
 */
@Data
public class Hr {

    private Integer id;

    private String name;

    private String phone;

    private String telephone;

    private String address;

    private Boolean enabled;

    private String username;

    private String password;

    private String userface;

    private String remark;

    private List<Role> roles;
}
