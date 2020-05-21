package org.yangsibao.vhr.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yangsibao
 * @date 2020/5/13-17:32
 */
@Data
public class Role implements Serializable {

    private Integer id;

    private String name;

    private String nameZh;
}
