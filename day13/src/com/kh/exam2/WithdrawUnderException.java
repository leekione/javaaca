package com.kh.exam2;

public class WithdrawUnderException extends Throwable {
    public WithdrawUnderException() {
        super();
    }

    public WithdrawUnderException(String message) {
        super(message);
    }

    public WithdrawUnderException(String message, Throwable cause) {
        super(message, cause);
    }

    public WithdrawUnderException(Throwable cause) {
        super(cause);
    }

    protected WithdrawUnderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
