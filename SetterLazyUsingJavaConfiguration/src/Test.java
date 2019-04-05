package com.capgemini.spring.test;
import com.capgemini.spring.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.spring.provider.*;
import com.capgemini.spring.render.*;

public class Test
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(HMConfiguration.class);
		System.out.println("Bins are created");
		MessageRenderer renderer = (MessageRenderer) context.getBean("renderer",MessageRenderer.class);
		renderer.render();
		System.out.println("Wow...I am working");
	}
}