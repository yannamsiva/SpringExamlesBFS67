package com.shiva.SC_Student_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");    
    College sb=(College)ctx.getBean("clg");
    System.out.println("College Information : ");
   sb.displayDetails();
    }
}
