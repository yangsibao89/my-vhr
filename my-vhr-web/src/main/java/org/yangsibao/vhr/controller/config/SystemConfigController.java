package org.yangsibao.vhr.controller.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yangsibao.vhr.model.Menu;
import org.yangsibao.vhr.service.MenuService;

import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/21-19:21
 */
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {

    @Autowired
    MenuService menuService;

    @GetMapping("/menu")
    public List<Menu> getMenusByHrId() {
        return menuService.getMenusByHrId();
    }
}
