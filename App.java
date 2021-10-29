package com.lakshmi.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
    	GreeterService g=context.getBean(GreeterService.class);
    	g.printGreeting();
        //System.out.println( "Hello World!" );
    }
}
