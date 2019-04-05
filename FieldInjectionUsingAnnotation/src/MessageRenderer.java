package com.capgemini.spring.render;
import com.capgemini.spring.provider.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class MessageRenderer
{	
	@Autowired
	private MessageProvider provider;
	
	public void render()
	{
		System.out.println(provider.getMessage());
	}
}