package org.yangsibao.vhr.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yangsibao
 * @date 2020/5/13-17:34
 */
@Data
public class Meta implements Serializable {

    private Boolean keepAlive;

    private Boolean requireAuth;
}
