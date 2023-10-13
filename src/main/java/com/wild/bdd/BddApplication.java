package com.wild.bdd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.wild.bdd.entity.Quest;
import com.wild.bdd.entity.Student;
import com.wild.bdd.repository.QuestRepository;
import com.wild.bdd.repository.StudentRepository;

@SpringBootApplication
public class BddApplication {

	private QuestRepository questRepository;
	private StudentRepository studentRepository;

	public BddApplication(QuestRepository questRepository, StudentRepository studentRepository) {
		this.questRepository = questRepository;
		this.studentRepository = studentRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BddApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() throws Exception {
		return (String[] args) -> {
			Quest quest = new Quest("Code Wars", 20);
			questRepository.save(quest);
			Student student = new Student("Juliette");
			studentRepository.save(student);
		};
	}

}
