package com.shiva.SC_Student_02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");    
    	AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
    	
    	
    	HelloWorld sb=(HelloWorld)ctx.getBean("hello");
    ctx.registerShutdownHook();
    
    }
}
