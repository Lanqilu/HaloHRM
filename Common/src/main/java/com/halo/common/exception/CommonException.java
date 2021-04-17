package com.halo.common.exception;

import com.halo.common.entity.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Halo
 * @date Created in 2021/04/17 5:43 PM
 * @description 自定义异常
 */
@Getter
@AllArgsConstructor
public class CommonException extends Exception {
    private ResultCode resultCode;

}
