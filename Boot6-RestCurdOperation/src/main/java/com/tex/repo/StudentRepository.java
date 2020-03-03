package com.tex.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tex.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
