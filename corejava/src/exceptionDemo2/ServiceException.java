package exceptionDemo2;

public class ServiceException extends Exception {
	private String errCode;
	private String errMsg;
	
	public ServiceException(String errCode,String errMsg){
		super(errMsg);
		this.errCode = errCode;
		this.errMsg = errMsg;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	@Override
	public String toString() {
		return "ServiceException [errCode=" + errCode + ", errMsg=" + errMsg
				+ "]";
	}
}
