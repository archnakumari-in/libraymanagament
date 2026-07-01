package com.example.libray.service;

import java.util.List;

import com.example.libray.dto.StudentDto;

public interface StudentService {
	
	public StudentDto saveStudentdetail(StudentDto studentDto);
	
	public StudentDto  updateStudentDetailsByid(int id,StudentDto studentDto );
	
	public StudentDto findStudentById(int id);
	
	public List<StudentDto> listOfStudentDetail();
	
	public StudentDto delateStudentById(int id);
	
	public StudentDto updateStudnetBystudentDob(String studentDob,StudentDto studentDto);
	
	
	public StudentDto findStudentByStudentName(String studentname);
	
	public List<StudentDto> findAllStudentListByEmail(String studentEmail);

}
