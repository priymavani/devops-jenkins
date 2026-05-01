package com.example.devops_practical_exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.devops_practical_exam.model.Student;
import com.example.devops_practical_exam.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAll() {
        return repository.findAll();
    }

    public Student save(Student student) {
        return repository.save(student);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
