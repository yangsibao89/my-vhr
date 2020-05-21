package org.yangsibao.vhr.mapper;

import org.yangsibao.vhr.model.Menu;

import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/18-19:17
 */
public interface MenuMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> getMenusByHrId(Integer hrid);

    List<Menu> getAllMenusWithRole();

    List<Menu> getAllMenus();

    List<Integer> getMidsByRid(Integer rid);
}
