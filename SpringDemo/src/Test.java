package com.capgemini.spring.test;

import com.capgemini.spring.provider.*;
import com.capgemini.spring.renderer.*;
import org.springframework.context.*;
import org.springframework.context.annotation.*;
import org.springframework.context.support.*;
@Lazy
public class Test
{ 
	public static void main(String args[])
	{
 		ApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
 		System.out.println("main class");
	 	MessageRenderer renderer = (MessageRenderer)context.getBean(MessageRenderer.class);
 		renderer.render();
 		MessageRenderer renderer1 = (MessageRenderer)context.getBean(MessageRenderer.class);
		renderer1.render();
 		if(renderer.equals(renderer1))
 		{
  			System.out.println("singleton");
 		}
 		else 
 		{
  			System.out.println("not singleton");
 		} 
	}
}
