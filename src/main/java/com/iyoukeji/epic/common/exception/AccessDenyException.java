package com.iyoukeji.epic.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 禁止访问异常类
 */
@ResponseStatus(HttpStatus.FORBIDDEN)
public class AccessDenyException extends RuntimeException {
    public AccessDenyException() {
        super("访问被拒，没有足够的权限执行此操作。");
    }

    public AccessDenyException(String message) {
        super(message);
    }

    public AccessDenyException(String message, Throwable cause) {
        super(message, cause);
    }
}
