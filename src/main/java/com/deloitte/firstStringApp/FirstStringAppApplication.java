package com.deloitte.firstStringApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class FirstStringAppApplication implements CommandLineRunner {

	private static Logger LOG = (Logger) LoggerFactory.getLogger(FirstStringAppApplication.class);

	public static void main(String[] args) {
		LOG.info("STARTING THE APPLICATION");
		SpringApplication.run(FirstStringAppApplication.class, args);

		Scanner scan = new Scanner(System.in);
		String something = scan.nextLine();
		LOG.info(something);

		LOG.info("APPLICATION FINISHED");
	}

	@Override
	public void run(String... args) {
		LOG.info("EXECUTING : command line runner");

		for (int i = 0; i < args.length; ++i) {
			LOG.info("args[{}]: {}", i, args[i]);
		}
	}
}
