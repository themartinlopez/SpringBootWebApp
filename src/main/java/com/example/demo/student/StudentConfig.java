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
                "code.mlopez@gmail.com",
                LocalDate.of(1994, Month.JULY, 14)
            );

            Student leo = new Student(
                    "Leonardo",
                    "leodan@gmail.com",
                    LocalDate.of(1994, Month.JULY, 14)
            );

            studentRepository.saveAll(
                    List.of(martin, leo)
            );

        };
    }
}
