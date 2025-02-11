package com.shiva;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.shiva.pojo.Welcome;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
      
    BeanFactory ctx=	new XmlBeanFactory(new ClassPathResource("spring.xml"));
    	Object obj = ctx.getBean("wel");
    	
    	Welcome w=(Welcome)obj;
    	
    	System.out.println(w.getMessage());
    	
    }
}
