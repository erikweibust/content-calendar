package net.weibust.contentcalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContentCalendarApplication {

	public static void main(String[] args) {
		System.out.println("*** in main");
		SpringApplication.run(ContentCalendarApplication.class, args);
		System.out.println("*** app should be running!");
	}

}
