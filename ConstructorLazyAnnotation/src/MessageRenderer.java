package com.capgemini.spring.render;
import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.*;
import org.springframework.context.annotation.Lazy;

@Lazy
@Component
public class MessageRenderer
{
	private MessageProvider provider;
	
	@Autowired
	
	public void MessageRenderer(MessageProvider provider)
	{
		System.out.println("bins are created");
		this.provider = provider;
	}
	public void render()
	{
		System.out.println(provider.getMessage());
	}
}