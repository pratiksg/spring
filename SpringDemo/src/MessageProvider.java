package com.capgemini.spring.provider;
import org.springframework.stereotype.*;
import org.springframework.context.annotation.Lazy*;

@Lazy
@Component
public interface MessageProvider{
	public String getMessage();
}
