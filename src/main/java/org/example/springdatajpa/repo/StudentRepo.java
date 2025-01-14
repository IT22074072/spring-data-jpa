package org.example.springdatajpa.repo;

import org.example.springdatajpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    //@Query("select s from Student s where s.name = ?1") - don't have to use this bcz Query DSL
    public List<Student> findByName(String name);
    public List<Student> findByMarks(int marks);
    public  List<Student> findByMarksGreaterThan(int marks);

}
