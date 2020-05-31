package org.yangsibao.vhr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yangsibao
 * @date 2020/5/21-15:31
 */
@Data
public class Employee implements Serializable {

    private Integer id;

    private String name;

    private String gender;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private Date birthday;

    private String idCard;//身份证号

    private String wedlock;//婚姻状况

    private Integer nationId;//民族

    private String nativePlace;//籍贯

    private Integer politicId;//政治面貌

    private String email;//邮箱

    private String phone;//电话

    private String address;//地址

    private Integer departmentId;//部门id

    private Integer jobLevelId;//职称

    private Integer posId;//岗位

    private String engageForm;//聘用形式

    private String tiptopDegree;//学历

    private String specialty;//专业

    private String school;//毕业院校

    private String workState;//在职情况

    private String workID;//工号

    private Double contractTerm;//合同周期

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private Date beginDate;//入职日期

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private Date conversionTime;//转正日期

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private Date notWorkDate;//离职日期

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private Date beginContract;//合同开始日期

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private Date endContract;//合同结束日期

    private Integer workAge;//工龄

    private Nation nation;
    private Politicsstatus politicsstatus;
    private Department department;
    private JobLevel jobLevel;
    private Position position;
    private SalaryFull salaryFull;
}
