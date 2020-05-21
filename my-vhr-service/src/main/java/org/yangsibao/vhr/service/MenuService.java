package org.yangsibao.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yangsibao.vhr.mapper.MenuMapper;
import org.yangsibao.vhr.mapper.MenuRoleMapper;
import org.yangsibao.vhr.model.Hr;
import org.yangsibao.vhr.model.Menu;

import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/20-18:58
 */
@Service
@CacheConfig
public class MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Autowired
    private MenuRoleMapper menuRoleMapper;

    public List<Menu> getMenusByHrId() {
        return menuMapper.getMenusByHrId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    @Cacheable
    public List<Menu> getAllMenusWithRole() {
        return menuMapper.getAllMenusWithRole();
    }

    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }

    public List<Integer> getMidsByRid(Integer rid) {
        return menuMapper.getMidsByRid(rid);
    }

    @Transactional
    public boolean updateMenuRole(Integer rid, Integer[] mids) {
        menuRoleMapper.deleteByRid(rid);
        if (mids == null || mids.length == 0) {
            return true;
        }
        Integer result = menuRoleMapper.insertRecord(rid, mids);
        return result == mids.length;
    }
}
