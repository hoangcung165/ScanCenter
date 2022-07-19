package com.platform.scancenter.dto.response;

import java.io.Serializable;

/**
 * TranCung
 * 19/07/2022
 * ResponseObject
 */
public class ResponseObject<T> implements IResponse, Serializable {
    private T data;
}
