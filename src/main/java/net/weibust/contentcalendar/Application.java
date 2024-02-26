package net.weibust.contentcalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("*** in main");
		SpringApplication.run(Application.class, args);
		System.out.println("*** app should be running!");
	}

}
