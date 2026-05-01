package com.example.devops_practical_exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.devops_practical_exam.model.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {
}
