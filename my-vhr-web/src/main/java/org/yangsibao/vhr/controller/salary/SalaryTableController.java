package org.yangsibao.vhr.controller.salary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yangsibao.vhr.model.RespPageBean;
import org.yangsibao.vhr.service.MonthlySalaryService;

/**
 * @author yangsibao
 * @date 2020/5/31-17:32
 */
@RestController
@RequestMapping("/salary/table")
public class SalaryTableController {

    @Autowired
    MonthlySalaryService monthlySalaryService;

    @GetMapping("/")
    private RespPageBean getMonthlySalaryByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        RespPageBean monthlySalaryByPage = monthlySalaryService.getMonthlySalaryByPage(page, size);
        return monthlySalaryByPage;
    }
}
