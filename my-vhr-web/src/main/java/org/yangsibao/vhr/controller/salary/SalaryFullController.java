package org.yangsibao.vhr.controller.salary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yangsibao.vhr.model.RespBean;
import org.yangsibao.vhr.model.SalaryFull;
import org.yangsibao.vhr.service.SalaryFullService;

import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/26-11:04
 */
@RestController
@RequestMapping("/salary/sob")
public class SalaryFullController {

    @Autowired
    SalaryFullService salaryFullService;

    @GetMapping("/")
    public List<SalaryFull> getAllSalaries() {
        return salaryFullService.getAllSalaryFulls();
    }

    @PostMapping("/")
    public RespBean addSalary(@RequestBody SalaryFull salaryFull) {
        if (salaryFullService.addSalaryFull(salaryFull) == 1) {
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败!");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteSalaryById(@PathVariable Integer id) {
        if (salaryFullService.deleteSalaryFullById(id) == 1) {
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @PutMapping("/")
    public RespBean updateSalaryById(@RequestBody SalaryFull salaryFull) {
        if ((salaryFullService.updateSalaryFullById(salaryFull)) == 1) {
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }
}
