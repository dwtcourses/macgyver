package io.macgyver.core;

import org.springframework.beans.factory.annotation.Value;

public class TestBean {

	String foo;

	public String getFoo() {
		return foo;
	}

	public void setFoo(String foo) {
		
		this.foo = foo;
	}
	
}