package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import main.course.CourseRepository;
import main.details.UserRepository;
import main.students.StudentRepository;
import main.topic.TopicRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {CourseRepository.class, UserRepository.class, TopicRepository.class, StudentRepository.class})
public class CourseApiApp extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);     
	}
}
