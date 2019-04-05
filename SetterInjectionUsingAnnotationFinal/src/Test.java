package com.capgemini.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.*;
import com.capgemini.spring.provider.*;
import com.capgemini.spring.render.*;

public class Test
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		MessageRenderer renderer = context.getBean(MessageRenderer.class);
		renderer.render();
		System.out.println("Wow...I am working");
	}
}