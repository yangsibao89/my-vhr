package org.yangsibao.vhr.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yangsibao
 * @date 2020/5/24-18:16
 */
@Data
public class Wage implements Serializable {

    private Integer id;//id

    private Integer basicWage;//基础工资

    private Integer seniorityWage;//工龄工资

    private Integer positionWage;//岗位工资

    private Integer performanceWage;//基础绩效工资

    private Integer phoneAllowance;//通讯补贴

    private Integer trafficAllowance;//交通补贴

    private Integer registAllowance;//注册补贴

    private Integer registSupply;//注册补发

    private Integer rentAllowance;//租房补贴

    private Integer rentSupply;//租房补发

    private Integer aloneAllowance;//独生子女补贴

    private Integer aloneSupply;//独生子女补贴补发

    private Integer hui;//回民

    private Integer fire;//烤火费

    private Integer cool;//防暑降温费

    private Integer propertyAllowance;//物业补贴

    private Integer warmAllowance;//采暖补贴

    private Integer warmSupply;//采暖补贴补发

    private Integer propertySupply;//物业补贴补发

    private Integer supply;//补发费用

    private Integer deduction;//扣款

    private Integer sickPersonalLeave;//病事假

    private Integer sum;//应发合计

    private Integer pension;//养老金

    private Integer largeMedical;//大额医疗

    private Integer occupationalAnnuity;//职业年金

    private Integer provident;//公积金

    private Integer occupationalAnnuityDecuction;//补扣职业年金

    private Integer largeMedicalDeduction;//补扣大额医疗

    private Integer pensionBack;//补缴养老金

    private Integer insuranceDeduction;//补扣保险

    private Integer sumDeduction;//扣款合计

    private Integer providentBack;//补缴公积金

    private Integer providentDeduction;//补扣公积金

    private Integer member;//会员费

    private Integer individual;//扣个税

    private Integer actualSum;//实发合计

    private Integer agencySum;//代发合计

    private Integer deductionSum;//代扣合计

    private Integer repay;//还款

    private Integer actualWage;//实发工资

    private Integer addProvidentBack;//补缴补充公积金

    private Integer total;//应付工资
}
