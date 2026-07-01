package com.example.libray.service;

import java.util.List;

import com.example.libray.dto.LibrayDto;

public interface LibrayService {

	public LibrayDto saveLibrayData(LibrayDto librayDto);
	
	public List<LibrayDto> listOfLibray();
}
