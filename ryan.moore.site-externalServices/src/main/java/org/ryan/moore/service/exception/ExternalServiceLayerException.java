package org.ryan.moore.service.exception;

/**
 * user: ryan.moore
 * date: 10/4/12
 */
public class ExternalServiceLayerException extends Exception {

    public ExternalServiceLayerException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExternalServiceLayerException(String message) {
        super(message);
    }

    public ExternalServiceLayerException(Throwable cause) {
        super(cause);
    }
}
