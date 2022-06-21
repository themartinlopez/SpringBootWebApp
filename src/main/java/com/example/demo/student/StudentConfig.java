package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository) {
        return args -> {
            Student martin = new Student(
                "Martin",
                "martin@gmail.com",
                LocalDate.of(2000, Month.JULY, 11)
            );

            Student leo = new Student(
                    "Leonardo",
                    "leonardo@gmail.com",
                    LocalDate.of(2001, Month.JULY, 12)
            );

            studentRepository.saveAll(
                    List.of(martin, leo)
            );

        };
    }
}
