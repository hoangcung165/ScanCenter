package com.platform.scancenter.enumeration;

import com.platform.scancenter.error.ErrorObject;

/**
 * TranCung
 * 19/07/2022
 * Default Exception Enum
 */
public enum DefaultException {
    AUTHENTICATION("AUTH01", "Authentication failed"),
    BAD_REQUEST("ERR01", "Internal error");
    private String code;
    private String message;

    DefaultException(String code, String description) {
        this.code = code;
        this.message = description;
    }


    public ErrorObject buildResponse(){
        return new ErrorObject(this.code, this.message);
    }
}
