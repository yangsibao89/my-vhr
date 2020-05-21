package org.yangsibao.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yangsibao.vhr.mapper.SalaryMapper;
import org.yangsibao.vhr.model.Salary;

import java.util.Date;
import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/21-18:57
 */
@Service
public class SalaryService {

    @Autowired
    SalaryMapper salaryMapper;

    public List<Salary> getAllSalaries() {
        return salaryMapper.getAllSalaries();
    }

    public Integer addSalary(Salary salary) {
        salary.setCreateDate(new Date());
        return salaryMapper.insertSelective(salary);
    }

    public Integer deleteSalaryById(Integer id) {
        return salaryMapper.deleteByPrimaryKey(id);
    }

    public Integer updateSalaryById(Salary salary) {
        return salaryMapper.updateByPrimaryKeySelective(salary);
    }
}
