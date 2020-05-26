package org.yangsibao.vhr.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.yangsibao.vhr.mapper.SalaryMapper;
import org.yangsibao.vhr.model.Salary;
import org.yangsibao.vhr.service.HrService;

import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/18-15:02
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MyVhrTest {


    @Autowired
    private HrService hrService;

    @Autowired
    private SalaryMapper salaryMapper;

    @Test
    public void test() {

        hrService.updatePasswd(3, "456");
    }

    @Test
    public void test1() {
        List<Salary> allSalaryInfo = salaryMapper.getAllSalaryInfo();

        System.out.println(allSalaryInfo);

    }

}
