package com.github.knightliao.hermesjsonrpc.core.exception;

/**
 * 序列化和反序列化出错时抛出
 */
public class ParseErrorException extends JsonRpcException {

    public static final int PARSE_ERROR_CODE = -32700;

    private static final long serialVersionUID = -6280386297535195039L;

    public ParseErrorException() {
        super();
    }

    public ParseErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParseErrorException(String message) {
        super(message);
    }

    public ParseErrorException(Throwable cause) {
        super(cause);
    }

    @Override
    public int errorCode() {
        return PARSE_ERROR_CODE;
    }

}
