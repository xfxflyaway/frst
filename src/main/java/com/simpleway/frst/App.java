package com.simpleway.frst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App
{
	public static final String APP_NAME = "frst";
	 
	 public static void main(String[] args) throws InterruptedException{
//        AppConfigurator.create(App.class).defaultEnv("dev")
//			        .run(args);
		 SpringApplication.run(App.class, args);

	}
}