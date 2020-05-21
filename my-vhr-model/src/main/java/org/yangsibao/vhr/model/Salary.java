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

    private Integer basicSalary;//基本工资

    private Integer bonus;//奖金

    private Integer lunchSalary;//午餐补贴

    private Integer trafficSalary;//交通补贴

    private Integer allSalary;//总收入

    private Integer pensionBase;//养老金基数

    private Float pensionPer;//养老金比率

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createDate;//创建时间

    private Integer medicalBase;//医疗保险基数

    private Float medicalPer;//医疗保险比率

    private Integer accumulationFundBase;//公积金基数

    private Float accumulationFundPer;//公积金比率

}
