package org.yangsibao.vhr.mapper;

import org.yangsibao.vhr.model.Department;

import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/21-16:48
 */
public interface DepartmentMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    List<Department> getAllDepartmentsByParentId(Integer pid);

    void addDep(Department dep);

    void deleteDepById(Department dep);

    List<Department> getAllDepartmentsWithOutChildren();
}
