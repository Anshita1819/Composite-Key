package com.key.CompositeKey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.key.CompositeKey.entity.Student;
import com.key.CompositeKey.entity.StudentComposite;

public interface StudentRepository extends JpaRepository<Student, StudentComposite> {

}
