package com.tex.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tex.model.Student;
import com.tex.repo.StudentRepository;
import com.tex.service.IStudentService;
@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private StudentRepository repo;
	
	@Override
	public Integer saveStudent(Student s) {

		return repo.save(s).getStdId();
	}
	@Override
	public List<Student> getAllStudent() {
		return repo.findAll();
	}
	@Override
	public Optional<Student> getOneStudent(Integer id) {
		return repo.findById(id);
	}
	@Override
	public void deleteStudent(Integer id) {
         repo.deleteById(id);
		
	}
	@Override
	public boolean isExist(Integer id) {
		return repo.existsById(id);
	}
}
