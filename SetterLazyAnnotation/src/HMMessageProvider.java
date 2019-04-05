package com.capgemini.spring.provider;
import org.springframework.stereotype.*;
import org.springframework.context.annotation.Lazy;

@Lazy
@Component
public class HMMessageProvider implements MessageProvider
{
	@Override
	public String getMessage()
	{
		return "Hello World";
	}
}  