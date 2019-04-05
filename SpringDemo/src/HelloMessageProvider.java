
package com.capgemini.spring.provider;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

//@Component("Hello")
public class HelloMessageProvider implements MessageProvider{

	
	public String getMessage(){
		return "Hello World";
	}
}