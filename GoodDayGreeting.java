package com.lakshmi.example2;

import org.springframework.stereotype.Component;

@Component
public class GoodDayGreeting implements Greeting {
 String greetin="havegoodday";

public String getGreetin() {
	return greetin;
}

public void setGreetin(String greetin) {
	this.greetin = greetin;
}
public String greet() {
	return greetin;
}
public GoodDayGreeting() {
	super();
	System.out.println(greetin);
}}


