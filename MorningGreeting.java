package com.lakshmi.example2;

import org.springframework.stereotype.Component;

@Component
public class MorningGreeting implements Greeting {
	String greetin="Good Morning";

	public String getGreetin() {
		return greetin;
	}

	public void setGreetin(String greetin) {
		this.greetin = greetin;
	}

	public String greet() {
		// TODO Auto-generated method stub
		return greetin;
	}

	public MorningGreeting() {
		super();
		System.out.println(greetin);
	}

	
	

}
