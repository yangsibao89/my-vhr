package org.yangsibao.vhr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangsibao
 * @date 2020/5/12-14:19
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }


}
