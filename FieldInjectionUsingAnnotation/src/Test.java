package com.capgemini.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.spring.provider.*;
import com.capgemini.spring.render.*;

public class Test
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		MessageRenderer renderer = (MessageRenderer) context.getBean("renderer");
		renderer.render();
		System.out.println("Wow...I am working");
	}
}