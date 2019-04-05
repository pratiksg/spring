package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy*;


@Lazy
@Component
public class MessageRenderer
{
	
	
	private MessageProvider provider;
	
	@Autowired
	public void MessageRenderer(MessageProvider provider){
		System.out.println("object created..");
		this.provider=provider;
	
	}
	
	
	public void render()
	{
		System.out.println(provider.getMessage());
	}
}