package com.platform.scancenter.error;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * TranCung
 * 19/07/2022
 * Error Object
 */
@Data
@AllArgsConstructor
public class ErrorObject {
    private String code;
    private String message;
}
