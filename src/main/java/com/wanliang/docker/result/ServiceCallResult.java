package com.wanliang.docker.result;

/**
 * Result of call service
 */
public class ServiceCallResult {
    private String message;
    private ResultCode code;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultCode getCode() {
        return code;
    }

    public void setCode(ResultCode code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ServiceCallResult{" +
                "message='" + message + '\'' +
                ", code=" + code +
                '}';
    }
}
