package com.shiva.SC_Student_02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    BeanFactory ctx=new XmlBeanFactory(new ClassPathResource("spring.xml"));
    
    SpringBean sb=(SpringBean)ctx.getBean("sb");
    SpringBean sb1=(SpringBean)ctx.getBean("sb");
    SpringBean sb2=(SpringBean)ctx.getBean("sb");
    SpringBean sb3=(SpringBean)ctx.getBean("sb");
    System.out.println(sb);
    System.out.println(sb1);
    System.out.println(sb2);
    System.out.println(sb3);
    }
}
