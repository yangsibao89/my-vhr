package org.yangsibao.vhr.utils;

import org.springframework.security.core.context.SecurityContextHolder;
import org.yangsibao.vhr.model.Hr;

/**
 * @author yangsibao
 * @date 2020/5/14-17:27
 */
public class HrUtils {

    public static Hr getCurrentHr() {
        return (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
