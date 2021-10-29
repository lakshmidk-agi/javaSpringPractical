package com.lakshmi.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreeterService{ 
@Autowired
@Qualifier("MorningGreeting")
	Greeting greetin;
public GreeterService() {
	super();
}
public Greeting getGreetin() {
	return greetin;
}
public void setGreetin(Greeting greetin) {
	this.greetin = greetin;
}
public void printGreeting() {
	greetin.greet();
}
}
