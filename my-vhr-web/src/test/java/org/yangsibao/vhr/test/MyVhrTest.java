package org.yangsibao.vhr.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.yangsibao.vhr.service.HrService;

/**
 * @author yangsibao
 * @date 2020/5/18-15:02
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MyVhrTest {


    @Autowired
    private HrService hrService;

    @Test
    public void test() {

        hrService.updatePasswd(3, "456");
    }

}
