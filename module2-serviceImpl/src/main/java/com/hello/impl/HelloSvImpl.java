package com.hello.impl;

import com.hello.interfaces.Greeting;
import com.hello.interfaces.HelloSvInterface;

public class HelloSvImpl implements HelloSvInterface {

	public Greeting xml() {
		Greeting greeting = new Greeting("Hello XML  (from HelloSvImpl)");
		return greeting;
	}

	public Greeting json() {
		Greeting greeting = new Greeting("Hello JSON (from HelloSvImpl)");
		return greeting;
	}
}
