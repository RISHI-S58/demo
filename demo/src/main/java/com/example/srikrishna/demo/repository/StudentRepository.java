package com.example.srikrishna.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.srikrishna.demo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
