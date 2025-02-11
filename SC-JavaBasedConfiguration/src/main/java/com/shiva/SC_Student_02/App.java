package com.shiva.SC_Student_02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.shiva.SC_Student_02.config.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");    
    	AbstractApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	
    	HelloWorld sb=(HelloWorld)ctx.getBean(HelloWorld.class);
    	System.out.println(sb.getMessage());
    ctx.registerShutdownHook();
    
    }
}
