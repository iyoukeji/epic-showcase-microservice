package com.iyoukeji.epic.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 无效操作异常类 用于操作前状态前置检查时抛出, 在Http请求上下文中会被Spring框架截获, 返回HTTP405
 */
@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
public class InvalidStateException extends IllegalStateException {
    public InvalidStateException() {
        super("当前状态下不允许此操作。");
    }

    public InvalidStateException(String message) {
        super(message);
    }

    public InvalidStateException(String message, Throwable cause) {
        super(message, cause);
    }
}
