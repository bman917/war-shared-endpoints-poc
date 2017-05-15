package com.hello.interfaces;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Greeting {

	String message;

	public Greeting() {

	}

	public Greeting(String msg) {
		this.message = msg;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
