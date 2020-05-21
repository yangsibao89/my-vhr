package org.yangsibao.vhr.mapper;

import org.yangsibao.vhr.model.Role;

import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/14-17:38
 */
public interface RoleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> getAllRoles();
}
