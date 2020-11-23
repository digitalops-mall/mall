package com.macro.mall.portal.constant;

import com.macro.mall.common.api.IErrorCode;

/**
 * 枚举了一些常用API操作码
 * Created by macro on 2019/4/19.
 */
public enum PortalResultCode implements IErrorCode {
    MEMBER_MISS(10001, "找不到对应的用户信息");
    private long code;
    private String message;

    private PortalResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
