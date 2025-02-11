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
    
    Student sb=(Student)ctx.getBean("st");
    System.out.println("Student Information : ");
    System.out.println(sb.getSno()+"\t"+sb.getSname()+"\t"+sb.getSadd());
    }
}
