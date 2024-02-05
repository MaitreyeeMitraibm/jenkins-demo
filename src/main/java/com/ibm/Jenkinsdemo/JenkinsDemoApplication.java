package com.ibm.Jenkinsdemo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ibm.Jenkinsdemo.model.Student;
import com.ibm.Jenkinsdemo.repo.StudentRepository;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;

@SpringBootApplication
public class JenkinsDemoApplication {

	private StudentRepository studentRepository;
	
	
	
	public JenkinsDemoApplication(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}
	@PostConstruct
	public void init() {
		studentRepository.save(new Student("John", "Doe", "john@email.com"));
		studentRepository.save(new Student("Mary", "Public", "mary@email.com"));
		studentRepository.save(new Student("Anindya", "Maitra", "anindya@email.com"));
	}

}
