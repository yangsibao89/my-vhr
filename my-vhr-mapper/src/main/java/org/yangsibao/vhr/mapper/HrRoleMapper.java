package org.yangsibao.vhr.mapper;

import org.apache.ibatis.annotations.Param;
import org.yangsibao.vhr.model.HrRole;

/**
 * @author yangsibao
 * @date 2020/5/20-17:51
 */
public interface HrRoleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(HrRole record);

    int insertSelective(HrRole record);

    HrRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HrRole record);

    int updateByPrimaryKey(HrRole record);

    void deleteByHrid(Integer hrid);

    Integer addRole(@Param("hrid") Integer hrid, @Param("rids") Integer[] rids);
}
