package org.yangsibao.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yangsibao.vhr.mapper.DepartmentMapper;
import org.yangsibao.vhr.model.Department;

import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/21-18:44
 */
@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    public List<Department> getAllDepartments() {
        return departmentMapper.getAllDepartmentsByParentId(-1);
    }

    public void addDep(Department dep) {
        dep.setEnabled(true);
        departmentMapper.addDep(dep);
    }

    public void deleteDepById(Department dep) {
        departmentMapper.deleteDepById(dep);
    }

    public List<Department> getAllDepartmentsWithOutChildren() {
        return departmentMapper.getAllDepartmentsWithOutChildren();
    }


}
