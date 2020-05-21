package org.yangsibao.vhr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yangsibao.vhr.model.Hr;
import org.yangsibao.vhr.service.HrService;

/**
 * @author yangsibao
 * @date 2020/5/21-14:49
 */
@RestController
public class HrInfoController {

    @Autowired
    private HrService hrService;

    @GetMapping("/hr/info")
    public Hr getCurrentHr(Authentication authentication) {
        return (Hr) authentication.getPrincipal();
    }
}
