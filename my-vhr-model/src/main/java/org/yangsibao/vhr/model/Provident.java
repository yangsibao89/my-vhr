package org.yangsibao.vhr.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yangsibao
 * @date 2020/5/24-18:56
 */
@Data
public class Provident implements Serializable {

    private Integer id;

    private Integer base;//缴费基数

    private Double per;//缴费比例

    private Integer personal;//个人

    private Integer unit;//单位

    private Integer month;//月缴费合计

    private Integer back;//补缴

    private Integer total;//合计
}
