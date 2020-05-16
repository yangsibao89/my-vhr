package org.yangsibao.vhr.model;

import lombok.Data;

import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/13-17:33
 */
@Data
public class Menu {

    private Integer id;

    private String url;

    private String path;

    private String component;

    private String name;

    private String iconCls;

    private Meta meta;

    private Integer parentId;

    private Boolean enabled;

    private List<Menu> children;

    private List<Role> roles;
}
