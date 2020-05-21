package org.yangsibao.vhr.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author yangsibao
 * @date 2020/5/21-15:50
 */
@Data
public class Politicsstatus implements Serializable {

    private Integer id;

    private String name;

    public Politicsstatus() {

    }

    public Politicsstatus(String name) {

        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Politicsstatus that = (Politicsstatus) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
