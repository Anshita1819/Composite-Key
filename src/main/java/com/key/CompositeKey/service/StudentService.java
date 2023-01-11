package com.key.CompositeKey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.key.CompositeKey.entity.Student;
import com.key.CompositeKey.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;
	
	public Student create(Student student)
	{
		return repo.save(student);
	}
	public List<Student> get()
	{
		return repo.findAll();
	}
}
