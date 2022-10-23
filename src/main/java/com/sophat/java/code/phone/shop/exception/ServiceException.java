package com.sophat.java.code.phone.shop.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceException {
    private HttpStatus status;
    private String message;
}
