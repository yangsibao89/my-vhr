package org.yangsibao.vhr.controller.salary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yangsibao.vhr.model.RespBean;
import org.yangsibao.vhr.model.RespPageBean;
import org.yangsibao.vhr.model.SalaryFull;
import org.yangsibao.vhr.service.EmployeeService;
import org.yangsibao.vhr.service.SalaryFullService;

import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/21-19:20
 */
@RestController
@RequestMapping("/salary/sobcfg")
public class SobConfigController {

    @Autowired
    EmployeeService employeeService;
    @Autowired
    SalaryFullService salaryFullService;

    @GetMapping("/")
    public RespPageBean getEmployeeByPageWithSalary(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        return employeeService.getEmployeeByPageWithSalary(page, size);
    }

    @GetMapping("/salaries")
    public List<SalaryFull> getAllSalaries() {
        return salaryFullService.getAllSalaryFulls();
    }

    @PutMapping("/")
    public RespBean updateEmployeeSalaryById(Integer eid, Integer sid) {
        Integer result = employeeService.updateEmployeeSalaryById(eid, sid);
        if (result == 1 || result == 2) {
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }
}
