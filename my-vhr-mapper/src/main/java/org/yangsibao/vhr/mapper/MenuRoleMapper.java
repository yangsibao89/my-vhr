package org.yangsibao.vhr.mapper;

import org.apache.ibatis.annotations.Param;
import org.yangsibao.vhr.model.MenuRole;

/**
 * @author yangsibao
 * @date 2020/5/20-18:02
 */
public interface MenuRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MenuRole record);

    int insertSelective(MenuRole record);

    MenuRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MenuRole record);

    int updateByPrimaryKey(MenuRole record);

    void deleteByRid(Integer rid);

    Integer insertRecord(@Param("rid") Integer rid, @Param("mids") Integer[] mids);
}
