package org.yangsibao.vhr.mapper;

import org.apache.ibatis.annotations.Param;
import org.yangsibao.vhr.model.Hr;
import org.yangsibao.vhr.model.Role;

import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/13-17:37
 */
public interface HrMapper {

    /**
     * 增加一个hr
     *
     * @param hr
     * @return
     */
    int insert(Hr hr);

    /**
     * 可选属性的添加一个hr
     *
     * @param record
     * @return
     */
    int insertSelective(Hr record);

    /**
     * 根据id删除一个hr
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 通过主键修改一个hr
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(Hr record);

    /**
     * 根据主键，可选择的修改一个hr
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Hr record);

    /**
     * 根据主键，修改一个hr的password
     *
     * @param hrid
     * @param encodePass
     * @return
     */
    Integer updatePasswd(@Param("hrid") Integer hrid, @Param("encodePass") String encodePass);

    /**
     * 通过id获取hr
     *
     * @param id
     * @return
     */
    Hr selectByPrimaryKey(Integer id);

    /**
     * 通过id或者关键字查找hr
     * 找出不包含本id的、含有keyword的（如果有）、所有hr
     *
     * @param hrid
     * @param keywords
     * @return
     */
    List<Hr> getAllHrs(@Param("hrid") Integer hrid, @Param("keywords") String keywords);

    /**
     * 获取除当前hr的所有hr
     *
     * @param id
     * @return
     */
    List<Hr> getAllHrsExceptCurrentHr(Integer id);

    /**
     * 获取当前hr的所有角色
     *
     * @param id
     * @return
     */
    List<Role> getHrRolesById(Integer id);

    Hr loadUserByUsername(String username);


}
