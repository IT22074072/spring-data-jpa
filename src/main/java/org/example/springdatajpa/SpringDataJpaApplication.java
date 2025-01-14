package org.example.springdatajpa;

import org.example.springdatajpa.model.Student;
import org.example.springdatajpa.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);

        StudentRepo repo = context.getBean(StudentRepo.class);

        s1.setRollNo(101);
        s1.setName("Dinithi");
        s1.setMarks(98);

        s2.setRollNo(102);
        s2.setName("Piyumi");
        s2.setMarks(97);

        s3.setRollNo(103);
        s3.setName("Jk");
        s3.setMarks(99);


        repo.save(s1);
    }

}
