package org.yangsibao.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yangsibao.vhr.mapper.MonthlySalaryMapper;
import org.yangsibao.vhr.model.MonthlySalary;
import org.yangsibao.vhr.model.RespPageBean;

import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/28-14:03
 */
@Service
public class MonthlySalaryService {

    @Autowired
    MonthlySalaryMapper monthlySalaryMapper;

    public Integer addMonthSalary(MonthlySalary monthlySalary) throws Exception {

        Integer insert = monthlySalaryMapper.insert(monthlySalary);


//        int insert = monthlySalaryMapper.addMonthSalary(month,eids);
//        RespBean respBean = RespBean.ok("插入成功");
        return insert;
    }

    public RespPageBean getMonthlySalaryByPage(Integer page, Integer size) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        List<MonthlySalary> monthlySalaryList = monthlySalaryMapper.getMonthlySalaryByPage(page, size);
        RespPageBean respPageBean = new RespPageBean();
        respPageBean.setData(monthlySalaryList);
        respPageBean.setTotal(monthlySalaryMapper.getTotal());
        return respPageBean;
    }
}
