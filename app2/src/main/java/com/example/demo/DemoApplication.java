package com.example.demo;

/**
 * @author SaynamSharma
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;

@SpringBootApplication
public class DemoApplication
	implements CommandLineRunner {
	@Autowired EmpRepo ob;
	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		StopWatch timeMeasure = new StopWatch();

		timeMeasure.start("Task 2");
		Thread.sleep(1000);
		timeMeasure.stop();
		long a1 = timeMeasure.getLastTaskTimeMillis();
		
		// Inserting the data in the mysql table.
		Runtime first = new Runtime(0,a1);
		
		ob.save(first);
	
	}
}
