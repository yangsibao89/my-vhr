package org.yangsibao.vhr.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.yangsibao.vhr.model.RespBean;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * @author yangsibao
 * @date 2020/5/22-9:44
 */
@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(SQLException.class)
    public RespBean sqlException(SQLException e) {
        if (e instanceof SQLIntegrityConstraintViolationException) {
            return RespBean.error("数据库相关操作失败");
        }
        return RespBean.error("数据库异常");
    }
}
