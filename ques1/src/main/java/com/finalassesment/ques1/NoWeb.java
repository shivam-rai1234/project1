package com.finalassesment.ques1;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class NoWeb {
public void printMessage(String[]args) {
	System.out.println("First Application Without Apache Tomcat");
Arrays.stream(args).forEach(System.out::println);
}
}
