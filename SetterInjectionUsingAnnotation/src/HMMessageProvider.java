package com.capgemini.spring.provider;

public class HMMessageProvider implements MessageProvider
{
	@Override
	public String getMessage()
	{
		return "Hello World";
	}
}  