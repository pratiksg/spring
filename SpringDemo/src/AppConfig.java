package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.*;
import com.capgemini.spring.renderer.*;
import org.springframework.context.annotation.*;


	@Configuration
	public class AppConfig {

	@Bean
 	public MessageRenderer getRenderer() {
	MessageRenderer renderer = new MessageRenderer();
        renderer.setMessageRenderer(new GMorningMessageProvider());
	return renderer;

  }
}