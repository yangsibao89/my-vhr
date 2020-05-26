package org.yangsibao.vhr.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yangsibao
 * @date 2020/5/24-18:45
 */
@Data
public class Insurance implements Serializable {

    private Integer id;

    private Integer base;//缴费基数

    private Double pensionPersonalPer;//养老金个人比率

    private Double pensionUnitPer;//养老金公司比率

    private Double pensionSumPer;//养老金合计比率

    private Double medicalPersonalPer;//医疗个人比率

    private Double medicalUnitPer;//医疗单位比率

    private Double medicalSumPer;//医疗合计比率

    private Double joblessPersonalPer;//失业个人比率

    private Double joblessUnitPer;//失业单位比率

    private Double joblessSumPer;//失业合计比率

    private Double injury;//工商保险

    private Double birth;//生育险

    private Integer personalDeduction;//个人扣款合计

    private Integer largeMedical;//大额医疗救助

    private Integer unitSum;//单位扣款合计

    private Integer month;//月缴费金额


}
