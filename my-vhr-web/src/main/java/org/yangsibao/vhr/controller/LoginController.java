package org.yangsibao.vhr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yangsibao.vhr.model.RespBean;

/**
 * @author yangsibao
 * @date 2020/5/22-10:26
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public RespBean login() {
        return RespBean.error("尚未登录，请登录!");
    }
}
