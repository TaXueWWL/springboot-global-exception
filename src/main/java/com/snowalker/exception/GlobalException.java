package com.snowalker.exception;

import com.snowalker.result.CodeMsg;

/**
 * @author snowalker
 * @date 2018/7/3
 * @desc 全局异常
 */
public class GlobalException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private CodeMsg cm;

    public GlobalException(CodeMsg cm) {
        super(cm.toString());
        this.cm = cm;
    }

    public GlobalException() {}

    public CodeMsg getCm() {
        return cm;
    }
}
