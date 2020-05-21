package org.yangsibao.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yangsibao.vhr.mapper.RoleMapper;
import org.yangsibao.vhr.model.Role;

import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/21-18:56
 */
@Service
public class RoleService {

    @Autowired
    RoleMapper roleMapper;

    public List<Role> getAllRoles() {
        return roleMapper.getAllRoles();
    }

    public Integer addRole(Role role) {
        if (!role.getName().startsWith("ROLE_")) {
            role.setName("ROLE_" + role.getName());
        }
        return roleMapper.insert(role);
    }

    public Integer deleteRoleById(Integer rid) {
        return roleMapper.deleteByPrimaryKey(rid);
    }
}
