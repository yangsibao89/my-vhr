package org.yangsibao.vhr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yangsibao
 * @date 2020/5/12-16:03
 */
@SpringBootApplication
@MapperScan("org.yangsibao.vhr.mapper")
public class MyVhrApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyVhrApplication.class, args);
    }
}
