package com.vcs.lects.l17.springboot;

public class HelloMsg {

	
	//{"message":"Labas as kebabas","severity":"INFO"}
	
	private String message;
	private Severity severity;

	public HelloMsg() {

	}

	public HelloMsg(String message, Severity severity) {
		super();
		this.message = message;
		this.severity = severity;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Severity getSeverity() {
		return severity;
	}

	public void setSeverity(Severity severity) {
		this.severity = severity;
	}

}
