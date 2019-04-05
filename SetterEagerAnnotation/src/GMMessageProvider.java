package com.capgemini.spring.provider;
import org.springframework.stereotype.*;
//import org.springframework.context.annotation.Lazy;

//@Lazy
//@Component("Good Morning")
public class GMMessageProvider implements MessageProvider
{
	@Override
	public String getMessage()
	{
		return "good Morning";

	}
}  