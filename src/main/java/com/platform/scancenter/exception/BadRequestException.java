package com.platform.scancenter.exception;

import com.platform.scancenter.error.ErrorObject;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * TranCung
 * 17/09/2022
 */
@Data
@AllArgsConstructor
public class BadRequestException extends Exception {
    private ErrorObject error;
}
