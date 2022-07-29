package com.deloitte.firstStringApp;

import com.deloitte.firstStringApp.dependency.ConsoleApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Console;
import java.util.Scanner;


@SpringBootApplication
public class FirstStringAppApplication {

	private static Logger LOG = (Logger) LoggerFactory.getLogger(FirstStringAppApplication.class);

	public static void main(String[] args) {
		LOG.info("STARTING THE APPLICATION");
		SpringApplication.run(FirstStringAppApplication.class, args);

		/*Scanner scan = new Scanner(System.in);
		String something = scan.nextLine();
		LOG.info(something);*/

		LOG.info("APPLICATION FINISHED");
	}
}
