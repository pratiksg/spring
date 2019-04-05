package com.capgemini.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.spring.provider.*;
import com.capgemini.spring.render.*;

@Configuration
public class GMConfiguration
{
	@Bean
	public MessageProvider provider()
	{
		return new GMMessageProvider();
	}
	
	@Bean
	public MessageRenderer renderer()
	{
		MessageRenderer renderer = new MessageRenderer(provider());
 		
 		return renderer;	
	}
	
}