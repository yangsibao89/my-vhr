package org.yangsibao.vhr.model;

import lombok.Data;

import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/21-18:50
 */
@Data
public class RespPageBean {

    private Long total;

    private List<?> data;
}
