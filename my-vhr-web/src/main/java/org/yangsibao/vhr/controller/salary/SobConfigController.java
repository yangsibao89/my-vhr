package org.yangsibao.vhr.controller.salary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yangsibao.vhr.converter.DateConverter;
import org.yangsibao.vhr.model.MonthlySalary;
import org.yangsibao.vhr.model.RespBean;
import org.yangsibao.vhr.model.RespPageBean;
import org.yangsibao.vhr.model.SalaryFull;
import org.yangsibao.vhr.service.EmployeeService;
import org.yangsibao.vhr.service.MonthlySalaryService;
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
    @Autowired
    MonthlySalaryService monthlySalaryService;

    @Autowired
    DateConverter dateConverter;

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

    @PostMapping("/month")//前后端的属性名一定要保持一致
    public RespBean addMonthSalary(@RequestBody MonthlySalary monthlySalary) {
//        ArrayList emps = (ArrayList) map.get("emps");
//        Iterator iterator = emps.iterator();
//        while (iterator.hasNext()) {
//            LinkedHashMap next = (LinkedHashMap) iterator.next();
//            LinkedHashMap salaryFull = (LinkedHashMap) next.get("salaryFull");
//            System.out.println(salaryFull);
//        }
//        String date = (String) map.get("month");
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
//        Date month = null;
//        try {
//            month = simpleDateFormat.parse(date);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        try {
//            return monthlySalaryService.addMonthSalary(month,emps);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return RespBean.error("插入失败", e.getMessage());
//        }
        try {

            Integer integer = monthlySalaryService.addMonthSalary(monthlySalary);
            return RespBean.ok("添加成功" + integer + "条");
        } catch (Exception e) {
            e.printStackTrace();
            return RespBean.error("添加失败");
        }
    }
}
