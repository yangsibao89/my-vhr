package org.yangsibao.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yangsibao.vhr.mapper.SalaryFullMapper;
import org.yangsibao.vhr.model.SalaryFull;

import java.util.Date;
import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/26-10:57
 */
@Service
public class SalaryFullService {

    @Autowired
    SalaryFullMapper salaryFullMapper;

    public List<SalaryFull> getAllSalaryFulls() {
        List<SalaryFull> allSalaryFulls = salaryFullMapper.getAllSalaryFulls();
        return allSalaryFulls;
    }

    public Integer addSalaryFull(SalaryFull salaryFull) {
        salaryFull.setCreatedate(new Date());
        return salaryFullMapper.insertSelective(salaryFull);
    }

    public Integer deleteSalaryFullById(Integer id) {
        return salaryFullMapper.deleteByPrimaryKey(id);
    }

    public Integer updateSalaryFullById(SalaryFull salaryFull) {
        return salaryFullMapper.updateByPrimaryKeySelective(salaryFull);
    }
}
