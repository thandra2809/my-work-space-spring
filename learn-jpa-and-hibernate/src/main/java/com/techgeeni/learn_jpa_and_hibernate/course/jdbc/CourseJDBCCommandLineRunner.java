package com.techgeeni.learn_jpa_and_hibernate.course.jdbc;

import com.techgeeni.learn_jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJDBCRepository courseJDBCRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJDBCRepository.insert(new Course(1L,"Learn AWS","in28Minutes"));
        courseJDBCRepository.insert(new Course(2L,"Learn Spring","TechGeeni"));
        courseJDBCRepository.insert(new Course(3L,"Learn Java","Aptech"));

        courseJDBCRepository.deleteById(3L);

        System.out.println(courseJDBCRepository.findById(1L));
        System.out.println(courseJDBCRepository.findById(2L));
        // System.out.println(courseJDBCRepository.findById(3L));
    }
}
