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
		System.out.println("bins are not created");
		MessageRenderer renderer = context.getBean(MessageRenderer.class);
		renderer.render();
		System.out.println("Wow...I am working");
		MessageRenderer renderer1 = context.getBean(MessageRenderer.class);
		System.out.println(renderer.hashCode());
		System.out.println(renderer1.hashCode());
	}
}