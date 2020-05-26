package org.yangsibao.vhr.mapper;

import org.yangsibao.vhr.model.SalaryFull;

import java.util.List;

public interface SalaryFullMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SalaryFull record);

    int insertSelective(SalaryFull record);

    SalaryFull selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SalaryFull record);

    int updateByPrimaryKey(SalaryFull record);

    List<SalaryFull> getAllSalaryFulls();
}