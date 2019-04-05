package com.capgemini.spring.provider;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;



//@Component("GMorning")
public class GMorningMessageProvider implements MessageProvider{
	

	public String getMessage(){
		return "Good Morning";
	}
}