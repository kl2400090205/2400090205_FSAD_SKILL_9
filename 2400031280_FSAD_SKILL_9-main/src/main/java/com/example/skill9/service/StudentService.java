package com.example.skill9.service;

import com.example.skill9.model.Student;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StudentService {

    private final Map<Long, Student> students = new HashMap<>();
    private Long nextId = 1L;

    public List<Student> getAll() {
        return new ArrayList<>(students.values());
    }

    public Student getById(Long id) {
        return students.get(id);
    }

    public Student add(Student student) {
        student.setId(nextId++);
        students.put(student.getId(), student);
        return student;
    }

    public Student update(Long id, Student student) {
        student.setId(id);
        students.put(id, student);
        return student;
    }

    public void delete(Long id) {
        students.remove(id);
    }
}