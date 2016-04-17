package com.iyoukeji.epic.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 请求参数错误异常类 用于操作前参数前置检查时抛出, 在Http请求上下文中会被Spring框架截获, 返回HTTP400
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidArgumentException extends IllegalArgumentException {
    public InvalidArgumentException() {
        super("请求参数不正确。");
    }

    public InvalidArgumentException(String message) {
        super(message);
    }

    public InvalidArgumentException(String message, Throwable cause) {
        super(message, cause);
    }
}
