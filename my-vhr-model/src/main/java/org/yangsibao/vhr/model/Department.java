package org.yangsibao.vhr.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author yangsibao
 * @date 2020/5/21-15:51
 */
@Data
public class Department implements Serializable {

    private Integer id;

    private String name;

    private Integer parentId;

    private String depPath;

    private Boolean enabled;

    private Boolean isParent;

    private List<Department> children;

    private Integer result;

    public Department() {
    }

    public Department(String name) {

        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
