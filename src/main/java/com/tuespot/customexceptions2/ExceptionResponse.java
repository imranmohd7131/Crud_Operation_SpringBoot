package com.tuespot.customexceptions2;

public class ExceptionResponse {
	
	private String msg;
	private String status;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ExceptionResponse [msg=" + msg + ", status=" + status + "]";
	}
	public ExceptionResponse(String msg, String status) {
		super();
		this.msg = msg;
		this.status = status;
	}
	public ExceptionResponse() {
		super();
	}
	
	

}
