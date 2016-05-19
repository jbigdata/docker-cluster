package com.wanliang.docker.model.ui;

import org.springframework.http.HttpStatus;

/**
 * DTO which is used for result
 */
public class UIResult {
    private int code;
    private String message;

    /**
     * code like HTTP CODE
     * @return
     */
    public int getCode() {
        return code;
    }

    /**
     * code like HTTP CODE
     * @param value
     * @return
     */
    public UIResult code(int value) {
        setCode(value);
        return this;
    }

    public UIResult code(HttpStatus value) {
        return code(value.value());
    }

    /**
     * code like HTTP CODE
     * @param code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * User friendly error message
     * @return
     */
    public String getMessage() {
        if (message != null) {
            return message;
        } else {
            return "";
        }
    }

    /**
     * User friendly error message
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "UIResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
