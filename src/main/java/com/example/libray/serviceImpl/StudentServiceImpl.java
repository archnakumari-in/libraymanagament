package com.example.libray.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libray.dto.StudentDto;
import com.example.libray.entity.StudentEo;
import com.example.libray.repository.StudentRepository;
import com.example.libray.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	public StudentRepository studentRepository;
	
	
	@Override
	public StudentDto saveStudentdetail(StudentDto studentDto) {

		StudentEo saveStudentEo= new StudentEo();
		BeanUtils.copyProperties(studentDto, saveStudentEo);
		studentRepository.save(saveStudentEo);
		return studentDto;
	}

	@Override
	public StudentDto updateStudentDetailsByid(int id, StudentDto studentDto) {

		StudentEo studentDetails=studentRepository.findById(id).get();
		BeanUtils.copyProperties(studentDetails, studentDto);
		studentRepository.save(studentDetails);
		return studentDto;
	}

	@Override
	public StudentDto findStudentById(int id) {
		StudentEo studentEo= studentRepository.findById(id).get();
		StudentDto studentdro= new StudentDto();
		BeanUtils.copyProperties(studentdro, studentEo);
		return studentdro;
	}

	@Override
	public List<StudentDto> listOfStudentDetail() {

		List<StudentEo> listOfEo= studentRepository.findAll();
		List<StudentDto> listOfstudentVo= new ArrayList<>();
		for(StudentEo studentEo: listOfEo) {
			StudentDto studentDto= new StudentDto();
			BeanUtils.copyProperties(studentEo, studentDto);
			listOfstudentVo.add(studentDto);
		}
		return listOfstudentVo;
	}

	@Override
	public StudentDto delateStudentById(int id) {

		StudentDto studentDto= new StudentDto();
	
		StudentEo studenteo= studentRepository.findById(id).get();
		
		BeanUtils.copyProperties(studenteo, studentDto);
		studentRepository.deleteById(id);
		return null;
	}

	@Override
	public StudentDto findStudentByStudentName(String studentname) {

		StudentEo studenteo= studentRepository.findByStudentname(studentname);
		StudentDto studentDto= new StudentDto();
		BeanUtils.copyProperties(studenteo, studentDto);
		
		return studentDto;
	}

	@Override
	public List<StudentDto> findAllStudentListByEmail(String studentEmail) {

	List<StudentEo> listOfstudentEo= studentRepository.findByStudentEmail(studentEmail);
	List<StudentDto> listOfDto=new ArrayList<>();
	for(StudentEo studentEo:listOfstudentEo) {
		StudentDto studentDto= new  StudentDto();
		BeanUtils.copyProperties(studentEo, studentDto);
		listOfDto.add(studentDto);
	}
		return listOfDto;
	}

	@Override
	public StudentDto updateStudnetBystudentDob(String studentDob, StudentDto studentDto) {
 
		StudentEo updateStudent=studentRepository.findByStudentDob(studentDob);
		BeanUtils.copyProperties(studentDto, updateStudent);
		studentRepository.save(updateStudent);
		return studentDto;
	}

}
