package com.example.libray.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.libray.dto.LibrayDto;
import com.example.libray.service.LibrayService;

@RestController
public class LibrayController {
	@Autowired
	public LibrayService librayService;
	

	@PostMapping("/save-libray-data")
	public LibrayDto saveLibrayData(@RequestBody LibrayDto librayDto) {
		LibrayDto dto= librayService.saveLibrayData(librayDto);
		return dto;
	}

	@GetMapping("/list-of-libray")
	public List<LibrayDto> listOfLibray(){
		List<LibrayDto> listOfDto= librayService.listOfLibray();
		return listOfDto;
	}
	
	

}
