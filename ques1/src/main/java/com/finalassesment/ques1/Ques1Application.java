package com.finalassesment.ques1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*Code By---ANAM TAMBOLI*/
@SpringBootApplication
public class Ques1Application implements CommandLineRunner {
@Autowired NoWeb service;
	public static void main(String[] args) {
		SpringApplication.run(Ques1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		service.printMessage(args);
	}

}
