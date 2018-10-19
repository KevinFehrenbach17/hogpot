package org.wecancodeit.courseswithinstructors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoursesWithInstructorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesWithInstructorsApplication.class, args);
		System.out.println("\n Server running on Localhost8080\n");
	}
}
