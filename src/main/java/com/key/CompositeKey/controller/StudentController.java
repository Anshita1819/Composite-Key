package com.key.CompositeKey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.key.CompositeKey.entity.Student;
import com.key.CompositeKey.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/")
	public Student add(@RequestBody Student student)
	{
		return service.create(student);
	}
	@GetMapping("/")
	public List<Student> find()
	{
		return service.get();
	}
	

}
