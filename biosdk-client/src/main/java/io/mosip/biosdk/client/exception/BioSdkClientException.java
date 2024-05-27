package io.mosip.biosdk.client.exception;

import io.mosip.kernel.core.exception.BaseUncheckedException;

/**
 * Custom Exception Class in case of error occurred in services.
 * 
 * @see io.mosip.kernel.core.exception.BaseUncheckedException
 * @author Janardhan B S
 * @since 1.0.0
 */
public class BioSdkClientException extends BaseUncheckedException {
	/**
	 * 
	 */
	public BioSdkClientException(String errorCode, String errorMessage) {
		super(errorCode, errorMessage);
	}

	/**
	 * 
	 */
	public BioSdkClientException(String errorCode, String errorMessage, Throwable rootCause) {
		super(errorCode, errorMessage, rootCause);
	}
}