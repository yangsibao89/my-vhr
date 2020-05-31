package org.yangsibao.vhr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class MonthlySalary implements Serializable {
    private Integer id;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date inmonth;//工资月份

    private String ename;

    private Integer basicwage;//基础工资

    private Integer senioritywage;//工龄工资

    private Integer positionwage;//岗位工资

    private Integer performancewage;//基础绩效工资

    private Integer phoneallowance;//通讯补贴

    private Integer trafficallowance;//交通补贴

    private Integer registallowance;//注册补贴

    private Integer registsupply;//注册补发

    private Integer rentallowance;//租房补贴

    private Integer rentsupply;//租房补发

    private Integer aloneallowance;//独生子女补贴

    private Integer alonesupply;//独生子女补贴补发

    private Integer hui;//回民

    private Integer fire;//烤火费

    private Integer cool;//防暑降温费

    private Integer propertyallowance;//物业补贴

    private Integer warmallowance;//采暖补贴

    private Integer warmsupply;//采暖补贴补发

    private Integer propertysupply;//物业补贴补发

    private Integer supply;//补发费用

    private Integer deduction;//扣款

    private Integer sickpersonalleave;//病事假

    private Integer sum;//应发合计

    private Integer pension;//养老金

    private Integer largemedical;//大额医疗

    private Integer occupationalannuity;//职业年金

    private Integer provident;//公积金

    private Integer occupationalannuitydecuction;//补扣职业年金

    private Integer largemedicaldeduction;//补扣大额医疗

    private Integer pensionback;//补缴养老金

    private Integer insurancededuction;//补扣保险

    private Integer sumdeduction;//扣款合计

    private Integer providentback;//补缴公积金

    private Integer providentdeduction;//补扣公积金

    private Integer member;//会员费

    private Integer individual;//扣个税

    private Integer actualsum;//实发合计

    private Integer agencysum;//代发合计

    private Integer deductionsum;//代扣合计

    private Integer repay;//还款

    private Integer actualwage;//实发工资

    private Integer addprovidentback;//补缴补充公积金

    private Integer total;//应付工资

    private Integer base;//缴费基数

    private Double pensionpersonalper;//养老金个人比率

    private Double pensionunitper;//养老金公司比率

    private Double pensionsumper;//养老金合计比率

    private Double medicalpersonalper;//医疗个人比率

    private Double medicalunitper;//医疗单位比率

    private Double medicalsumper;//医疗合计比率

    private Double joblesspersonalper;//失业个人比率

    private Double joblessunitper;//失业单位比率

    private Double joblesssumper;//失业合计比率

    private Double injury;//工伤保险

    private Double birth;//生育险

    private Integer personaldeduction;//个人扣款合计

    private Integer ilargemedical;//大额医疗救助

    private Integer unitsum;//单位扣款合计

    private Integer month;//月缴费金额

    private Integer pbase;//缴费基数

    private Integer per;//缴费比例

    private Integer personal;//个人

    private Integer unit;//单位

    private Integer pmonth;//月缴费合计

    private Integer back;//补缴

    private Integer ptotal;//合计

    private Integer bonus;//奖金

    private Integer allsalary;//总收入

    private List<Employee> emps;
}