package com.example.fetchapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * FetchCamundaTaskApiApplication is the entry point of the spring boot application.
 * This class contains the main method which is used to run the application.
 * <p> @author Darshan Gohil </p>
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.example.FetchMethod")
public class FetchCamundaTaskApiApplication {

	/**
	 * The main that starts the spring boot application.
	 *
	 * @param args command-line arguments passed to the application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(FetchCamundaTaskApiApplication.class, args);
	}

}
