package com.wanliang.docker.model.ui;

/**
 * DTO which is used for ui errors
 */
public class UiError extends UIResult {
    private String stack;

    /**
     * Stack trace of error
     * @return
     */
    public String getStack() {
        return stack;
    }

    /**
     * Stack trace of error
     * @param stack
     */
    public void setStack(String stack) {
        this.stack = stack;
    }

    @Override
    public String toString() {
        return "UiError{" +
                "stack='" + stack + '\'' +
                "} " + super.toString();
    }
}
