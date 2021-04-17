package com.halo.common.handler;

import com.halo.common.entity.Result;
import com.halo.common.entity.ResultCode;
import com.halo.common.exception.CommonException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Halo
 * @date Created in 2021/04/17 5:33 PM
 * @description 自定义公共异常处理器
 */
@ControllerAdvice // 声明异常处理器
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class) // 指定异常处理器
    @ResponseBody // 将异常封装成字符串Json对象
    public Result error(HttpServletRequest request, HttpServletResponse response, Exception e) {
        // 自定义异常
        if (e.getClass() == CommonException.class) {
            // 向下转型
            CommonException ce = (CommonException) e;
            return new Result(ce.getResultCode());
        } else {
            return new Result(ResultCode.SERVER_ERROR);
        }


    }
}
