package br.com.herbertrausch.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil {
	
	public static ApplicationContext getContext(){
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		return context;
	}

}
