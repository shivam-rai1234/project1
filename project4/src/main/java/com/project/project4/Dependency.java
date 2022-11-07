package com.project.project4;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dependency {
	@GetMapping("/dependency_of_application/{is}")
	public String Dependencyappplication(@PathVariable String is) 
	{
		
		 final String dependency1="actuator";
		  final String dependency2="mysql";
		  final String dependency3="h2";
		  final String dependency4="jpa";
		  final String dependency5="jdbc";
		  final String dependency6="web";
		  
		  if (is.equals(dependency1)) 
		  {
			 return "<dependency>\r\n<groupId>org.springframework.boot</groupId>\r\n<artifactId>spring-boot-starter-actuator</artifactId>\r\n</dependency>";
		  }
		  if(is.equals(dependency2)) 
		  {
			  return("<dependency>\r\n"
			  		+ "			<groupId>com.mysql</groupId>\r\n"
			  		+ "			<artifactId>mysql-connector-j</artifactId>\r\n"
			  		+ "			<scope>runtime</scope>\r\n"
			  		+ "		</dependency>");
		  }
		  
		  if(is.equals(dependency3)) 
		  {
			  return("<dependency>\r\n"
			  		+ "			<groupId>com.h2database</groupId>\r\n"
			  		+ "			<artifactId>h2</artifactId>\r\n"
			  		+ "			<scope>runtime</scope>\r\n"
			  		+ "		</dependency>");
		  }
		  
		  if(is.equals(dependency4)) 
		  {
			  return("<dependency>\r\n"
			  		+ "			<groupId>org.springframework.boot</groupId>\r\n"
			  		+ "			<artifactId>spring-boot-starter-data-jpa</artifactId>\r\n"
			  		+ "		</dependency>");
		  }
		  
		  if(is.equals(dependency5)) 
		  {
			  return("<dependency>\r\n"
			  		+ "			<groupId>org.springframework.boot</groupId>\r\n"
			  		+ "			<artifactId>spring-boot-starter-jdbc</artifactId>\r\n"
			  		+ "		</dependency>");
		  }
		  if(is.equals(dependency6)) 
		  {
			  return("<dependency>\r\n"
			  		+ "			<groupId>org.springframework.boot</groupId>\r\n"
			  		+ "			<artifactId>spring-boot-starter-web</artifactId>\r\n"
			  		+ "		</dependency>");
		  }
		  
		  
		  return null;
		  
		 
		  
		  
	}
}
