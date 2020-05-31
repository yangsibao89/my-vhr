package org.yangsibao.vhr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SalaryFull implements Serializable {
    private Integer id;

    private String name;//套账名称

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

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createdate;//创建时间

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date issuedate;//发布时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getBasicwage() {
        return basicwage;
    }

    public void setBasicwage(Integer basicwage) {
        this.basicwage = basicwage;
    }

    public Integer getSenioritywage() {
        return senioritywage;
    }

    public void setSenioritywage(Integer senioritywage) {
        this.senioritywage = senioritywage;
    }

    public Integer getPositionwage() {
        return positionwage;
    }

    public void setPositionwage(Integer positionwage) {
        this.positionwage = positionwage;
    }

    public Integer getPerformancewage() {
        return performancewage;
    }

    public void setPerformancewage(Integer performancewage) {
        this.performancewage = performancewage;
    }

    public Integer getPhoneallowance() {
        return phoneallowance;
    }

    public void setPhoneallowance(Integer phoneallowance) {
        this.phoneallowance = phoneallowance;
    }

    public Integer getTrafficallowance() {
        return trafficallowance;
    }

    public void setTrafficallowance(Integer trafficallowance) {
        this.trafficallowance = trafficallowance;
    }

    public Integer getRegistallowance() {
        return registallowance;
    }

    public void setRegistallowance(Integer registallowance) {
        this.registallowance = registallowance;
    }

    public Integer getRegistsupply() {
        return registsupply;
    }

    public void setRegistsupply(Integer registsupply) {
        this.registsupply = registsupply;
    }

    public Integer getRentallowance() {
        return rentallowance;
    }

    public void setRentallowance(Integer rentallowance) {
        this.rentallowance = rentallowance;
    }

    public Integer getRentsupply() {
        return rentsupply;
    }

    public void setRentsupply(Integer rentsupply) {
        this.rentsupply = rentsupply;
    }

    public Integer getAloneallowance() {
        return aloneallowance;
    }

    public void setAloneallowance(Integer aloneallowance) {
        this.aloneallowance = aloneallowance;
    }

    public Integer getAlonesupply() {
        return alonesupply;
    }

    public void setAlonesupply(Integer alonesupply) {
        this.alonesupply = alonesupply;
    }

    public Integer getHui() {
        return hui;
    }

    public void setHui(Integer hui) {
        this.hui = hui;
    }

    public Integer getFire() {
        return fire;
    }

    public void setFire(Integer fire) {
        this.fire = fire;
    }

    public Integer getCool() {
        return cool;
    }

    public void setCool(Integer cool) {
        this.cool = cool;
    }

    public Integer getPropertyallowance() {
        return propertyallowance;
    }

    public void setPropertyallowance(Integer propertyallowance) {
        this.propertyallowance = propertyallowance;
    }

    public Integer getWarmallowance() {
        return warmallowance;
    }

    public void setWarmallowance(Integer warmallowance) {
        this.warmallowance = warmallowance;
    }

    public Integer getWarmsupply() {
        return warmsupply;
    }

    public void setWarmsupply(Integer warmsupply) {
        this.warmsupply = warmsupply;
    }

    public Integer getPropertysupply() {
        return propertysupply;
    }

    public void setPropertysupply(Integer propertysupply) {
        this.propertysupply = propertysupply;
    }

    public Integer getSupply() {
        return supply;
    }

    public void setSupply(Integer supply) {
        this.supply = supply;
    }

    public Integer getDeduction() {
        return deduction;
    }

    public void setDeduction(Integer deduction) {
        this.deduction = deduction;
    }

    public Integer getSickpersonalleave() {
        return sickpersonalleave;
    }

    public void setSickpersonalleave(Integer sickpersonalleave) {
        this.sickpersonalleave = sickpersonalleave;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getPension() {
        return pension;
    }

    public void setPension(Integer pension) {
        this.pension = pension;
    }

    public Integer getLargemedical() {
        return largemedical;
    }

    public void setLargemedical(Integer largemedical) {
        this.largemedical = largemedical;
    }

    public Integer getOccupationalannuity() {
        return occupationalannuity;
    }

    public void setOccupationalannuity(Integer occupationalannuity) {
        this.occupationalannuity = occupationalannuity;
    }

    public Integer getProvident() {
        return provident;
    }

    public void setProvident(Integer provident) {
        this.provident = provident;
    }

    public Integer getOccupationalannuitydecuction() {
        return occupationalannuitydecuction;
    }

    public void setOccupationalannuitydecuction(Integer occupationalannuitydecuction) {
        this.occupationalannuitydecuction = occupationalannuitydecuction;
    }

    public Integer getLargemedicaldeduction() {
        return largemedicaldeduction;
    }

    public void setLargemedicaldeduction(Integer largemedicaldeduction) {
        this.largemedicaldeduction = largemedicaldeduction;
    }

    public Integer getPensionback() {
        return pensionback;
    }

    public void setPensionback(Integer pensionback) {
        this.pensionback = pensionback;
    }

    public Integer getInsurancededuction() {
        return insurancededuction;
    }

    public void setInsurancededuction(Integer insurancededuction) {
        this.insurancededuction = insurancededuction;
    }

    public Integer getSumdeduction() {
        return sumdeduction;
    }

    public void setSumdeduction(Integer sumdeduction) {
        this.sumdeduction = sumdeduction;
    }

    public Integer getProvidentback() {
        return providentback;
    }

    public void setProvidentback(Integer providentback) {
        this.providentback = providentback;
    }

    public Integer getProvidentdeduction() {
        return providentdeduction;
    }

    public void setProvidentdeduction(Integer providentdeduction) {
        this.providentdeduction = providentdeduction;
    }

    public Integer getMember() {
        return member;
    }

    public void setMember(Integer member) {
        this.member = member;
    }

    public Integer getIndividual() {
        return individual;
    }

    public void setIndividual(Integer individual) {
        this.individual = individual;
    }

    public Integer getActualsum() {
        return actualsum;
    }

    public void setActualsum(Integer actualsum) {
        this.actualsum = actualsum;
    }

    public Integer getAgencysum() {
        return agencysum;
    }

    public void setAgencysum(Integer agencysum) {
        this.agencysum = agencysum;
    }

    public Integer getDeductionsum() {
        return deductionsum;
    }

    public void setDeductionsum(Integer deductionsum) {
        this.deductionsum = deductionsum;
    }

    public Integer getRepay() {
        return repay;
    }

    public void setRepay(Integer repay) {
        this.repay = repay;
    }

    public Integer getActualwage() {
        return actualwage;
    }

    public void setActualwage(Integer actualwage) {
        this.actualwage = actualwage;
    }

    public Integer getAddprovidentback() {
        return addprovidentback;
    }

    public void setAddprovidentback(Integer addprovidentback) {
        this.addprovidentback = addprovidentback;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Double getPensionpersonalper() {
        return pensionpersonalper;
    }

    public void setPensionpersonalper(Double pensionpersonalper) {
        this.pensionpersonalper = pensionpersonalper;
    }

    public Double getPensionunitper() {
        return pensionunitper;
    }

    public void setPensionunitper(Double pensionunitper) {
        this.pensionunitper = pensionunitper;
    }

    public Double getPensionsumper() {
        return pensionsumper;
    }

    public void setPensionsumper(Double pensionsumper) {
        this.pensionsumper = pensionsumper;
    }

    public Double getMedicalpersonalper() {
        return medicalpersonalper;
    }

    public void setMedicalpersonalper(Double medicalpersonalper) {
        this.medicalpersonalper = medicalpersonalper;
    }

    public Double getMedicalunitper() {
        return medicalunitper;
    }

    public void setMedicalunitper(Double medicalunitper) {
        this.medicalunitper = medicalunitper;
    }

    public Double getMedicalsumper() {
        return medicalsumper;
    }

    public void setMedicalsumper(Double medicalsumper) {
        this.medicalsumper = medicalsumper;
    }

    public Double getJoblesspersonalper() {
        return joblesspersonalper;
    }

    public void setJoblesspersonalper(Double joblesspersonalper) {
        this.joblesspersonalper = joblesspersonalper;
    }

    public Double getJoblessunitper() {
        return joblessunitper;
    }

    public void setJoblessunitper(Double joblessunitper) {
        this.joblessunitper = joblessunitper;
    }

    public Double getJoblesssumper() {
        return joblesssumper;
    }

    public void setJoblesssumper(Double joblesssumper) {
        this.joblesssumper = joblesssumper;
    }

    public Double getInjury() {
        return injury;
    }

    public void setInjury(Double injury) {
        this.injury = injury;
    }

    public Double getBirth() {
        return birth;
    }

    public void setBirth(Double birth) {
        this.birth = birth;
    }

    public Integer getPersonaldeduction() {
        return personaldeduction;
    }

    public void setPersonaldeduction(Integer personaldeduction) {
        this.personaldeduction = personaldeduction;
    }

    public Integer getIlargemedical() {
        return ilargemedical;
    }

    public void setIlargemedical(Integer ilargemedical) {
        this.ilargemedical = ilargemedical;
    }

    public Integer getUnitsum() {
        return unitsum;
    }

    public void setUnitsum(Integer unitsum) {
        this.unitsum = unitsum;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getPbase() {
        return pbase;
    }

    public void setPbase(Integer pbase) {
        this.pbase = pbase;
    }

    public Integer getPer() {
        return per;
    }

    public void setPer(Integer per) {
        this.per = per;
    }

    public Integer getPersonal() {
        return personal;
    }

    public void setPersonal(Integer personal) {
        this.personal = personal;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Integer getPmonth() {
        return pmonth;
    }

    public void setPmonth(Integer pmonth) {
        this.pmonth = pmonth;
    }

    public Integer getBack() {
        return back;
    }

    public void setBack(Integer back) {
        this.back = back;
    }

    public Integer getPtotal() {
        return ptotal;
    }

    public void setPtotal(Integer ptotal) {
        this.ptotal = ptotal;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public Integer getAllsalary() {
        return allsalary;
    }

    public void setAllsalary(Integer allsalary) {
        this.allsalary = allsalary;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }
}