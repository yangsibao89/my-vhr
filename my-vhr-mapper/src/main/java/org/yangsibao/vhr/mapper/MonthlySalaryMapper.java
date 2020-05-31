package org.yangsibao.vhr.mapper;

import org.apache.ibatis.annotations.Param;
import org.yangsibao.vhr.model.MonthlySalary;

import java.util.List;

public interface MonthlySalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MonthlySalary record);

    int insertSelective(MonthlySalary record);

    MonthlySalary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MonthlySalary record);

    int updateByPrimaryKey(MonthlySalary record);

    List<MonthlySalary> getMonthlySalaryByPage(@Param("page") Integer page, @Param("size") Integer size);

    Long getTotal();
}