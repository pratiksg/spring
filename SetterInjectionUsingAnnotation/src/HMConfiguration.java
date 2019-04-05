package com.capgemini.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.spring.provider.*;
import com.capgemini.spring.render.*;

@Configuration
public class HMConfiguration
{
	@Bean
	public MessageProvider provider()
	{
		return new HMMessageProvider();
	}
	
	@Bean
	public MessageRenderer renderer()
	{
		MessageRenderer renderer = new MessageRenderer();
 		renderer.setMessageRenderer(provider());
 		return renderer;	
	}
	
}