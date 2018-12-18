package com.julyseventh.restful.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {

	private String msg;

	public HelloWorldBean(String msg) {
		// TODO Auto-generated constructor stub
		this.msg = msg;
	}

	public void setMsp(String msp) {
		this.msg = msp;
	}

	public String getMsp() {
		return msg;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [msp=" + msg + ", getMsp()=" + getMsp() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
