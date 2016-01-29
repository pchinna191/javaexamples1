package com.test.dao;

public class DBException extends Exception{
	private String errorCode;
	private String errorMsg;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Override
	public String toString() {
		return "DBException [errorCode=" + errorCode + ", errorMsg=" + errorMsg
				+ "]";
	}

	public DBException(String errorCode, String errorMsg) {
		super(errorMsg);
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public DBException(String errorMsg) {
		super(errorMsg);
		this.errorMsg = errorMsg;
	}

}
