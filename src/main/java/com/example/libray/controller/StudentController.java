package com.example.libray.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.libray.dto.StudentDto;
import com.example.libray.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	public StudentService studentService;
	
	@PostMapping("/save-student-detail")
	public StudentDto saveStudentdetail(@RequestBody StudentDto studentDto) {
		StudentDto saveStudentDto= studentService.saveStudentdetail(studentDto);
		return saveStudentDto;
	}
	
	@PutMapping("/update-student-details-by/{id}")
	public StudentDto updateStudentDetailsByid(@PathVariable int id, @RequestBody StudentDto studentDto) {
		StudentDto updateStudent=studentService.updateStudentDetailsByid(id, studentDto);
		return updateStudent;
	}

		
	
	@GetMapping("/find-student-by/{Id}")
	public StudentDto findStudentById(@PathVariable int id) {
		StudentDto studentDto= studentService.findStudentById(id);
		return studentDto;
	}
	
	@GetMapping("/list-of-student-details")
	public List<StudentDto> listOfStudentDetail(){
		List<StudentDto> listOfStudent= studentService.listOfStudentDetail();
		return listOfStudent;
	}
	
	@DeleteMapping("/delate-student-by/{id}")
	public StudentDto delateStudentById(@PathVariable int id) {
		StudentDto studentDto=studentService.delateStudentById(id);
		return studentDto;
		
	}
	
	@GetMapping("/findStudentByStudentName/{studentname}")
	public StudentDto findStudentByStudentName(@PathVariable String studentname) {
	
		StudentDto findStudentDto=studentService.findStudentByStudentName(studentname);
		return findStudentDto;
	}

	@GetMapping("/find-all-student-list-by-email/{studentEmail}")
	public List<StudentDto> findAllStudentListByEmail(@PathVariable String studentEmail) {
	
		List<StudentDto> listOfDto= studentService.findAllStudentListByEmail(studentEmail);
		return listOfDto;
	}


@PutMapping("/update-studnet-by-studentDob/{studentDob}")
	public StudentDto updateStudnetBystudentDob(@PathVariable String studentDob, @RequestBody StudentDto studentDto) {
		StudentDto updateStudentDetailDto= studentService.updateStudnetBystudentDob(studentDob, studentDto);
		return updateStudentDetailDto;
	}

	

}
