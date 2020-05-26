package org.yangsibao.vhr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 套账表
 *
 * @author yangsibao
 * @date 2020/5/21-15:57
 */
@Data
public class Salary implements Serializable {

    private Integer id;//套账id

    private String name;//套账名称

    private Integer bonus;//奖金

    private Integer allSalary;//总收入

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createDate;//创建时间

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date issueDate;//工资发布日期

    private Wage wage;//基本工资

    private Insurance insurance;//社保

    private Provident provident;//公积金
}
