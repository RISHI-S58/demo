
package com.example.srikrishna.demo.service;

import java.util.List;

import com.example.srikrishna.demo.model.Student;

public interface StudentService {
   public Student saveStudent(Student student);
   public List<Student> getAllStudents();
   public void deleteStudent(int id);
   public Student getStudentById(int id);
}
