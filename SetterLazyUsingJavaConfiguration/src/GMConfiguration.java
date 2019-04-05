package com.capgemini.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import com.capgemini.spring.provider.*;
import com.capgemini.spring.render.*;

@Configuration
public class GMConfiguration
{
	@Lazy
	@Bean
	public MessageProvider provider()
	{
		return new GMMessageProvider();
	}
	
	@Lazy
	@Bean
	public MessageRenderer renderer()
	{
		MessageRenderer renderer = new MessageRenderer();
 		renderer.setMessageRenderer(provider());
 		return renderer;	
	}
	
}