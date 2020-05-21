package org.yangsibao.vhr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author yangsibao
 * @date 2020/5/21-15:54
 */
@Data
public class JobLevel implements Serializable {

    private Integer id;

    private String name;

    private String titleLevel;

    private Boolean enabled;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private Date createDate;

    public JobLevel() {

    }

    public JobLevel(String name) {

        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobLevel jobLevel = (JobLevel) o;
        return Objects.equals(name, jobLevel.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
