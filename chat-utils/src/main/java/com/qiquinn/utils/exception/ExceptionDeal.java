package com.qiquinn.utils.exception;

import com.qiquinn.model.result.RequestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.sql.SQLException;

/**
 * @Author:QiQuinn
 * @Desicription:
 * @Date:Created in 2019/8/9
 * @Modified By:
 */
@ControllerAdvice
public class ExceptionDeal
{
    private final static Logger loggers = LoggerFactory.getLogger(ExceptionDeal.class);

    @ExceptionHandler(value = SQLException.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public RequestResult sqlExeption(SQLException ex)
    {
        loggers.error(ex.toString(),ex);
        return new RequestResult(HttpStatus.INTERNAL_SERVER_ERROR.value(),"数据库错误",ex);
    }
}
