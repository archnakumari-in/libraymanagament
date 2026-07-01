package com.example.libray.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.libray.entity.StudentEo;

public interface StudentRepository extends JpaRepository<StudentEo, Integer> {
	
	public StudentEo findByStudentname(String studentname);
	

	public List<StudentEo> findByStudentEmail(String studentEmail);
	
	public StudentEo findByStudentDob(String studentDob);

}
