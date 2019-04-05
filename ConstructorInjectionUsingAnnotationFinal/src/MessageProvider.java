package com.capgemini.spring.provider;
import org.springframework.stereotype.*;

@Component
public interface MessageProvider
{
	public String getMessage();
}