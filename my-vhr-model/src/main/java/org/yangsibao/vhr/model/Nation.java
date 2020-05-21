package org.yangsibao.vhr.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author yangsibao
 * @date 2020/5/21-15:46
 */
@Data
public class Nation implements Serializable {

    private Integer id;

    private String name;

    public Nation() {
    }


    public Nation(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nation nation = (Nation) o;
        return Objects.equals(name, nation.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
