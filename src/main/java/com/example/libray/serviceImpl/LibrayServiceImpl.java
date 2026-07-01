package com.example.libray.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libray.dto.LibrayDto;
import com.example.libray.entity.LibrayryEntity;
import com.example.libray.repository.LibrayRepository;
import com.example.libray.service.LibrayService;

@Service
public class LibrayServiceImpl implements LibrayService {

	@Autowired
	public LibrayRepository librayRepository;
	
	@Override
	public LibrayDto saveLibrayData(LibrayDto librayDto) {

		LibrayryEntity librayryEntity= new LibrayryEntity();
		BeanUtils.copyProperties(librayDto, librayryEntity);
		librayRepository.save(librayryEntity);
		return librayDto;
	}

	@Override
	public List<LibrayDto> listOfLibray() {

		List<LibrayryEntity>  listOfEo= librayRepository.findAll();
		List<LibrayDto> listOfDto= new ArrayList<>();
		for(LibrayryEntity librayryEntity:listOfEo) {
			LibrayDto libDto= new LibrayDto();
			BeanUtils.copyProperties(librayryEntity, libDto);
			listOfDto.add(libDto);
			
		}
		
		return listOfDto;
	}

}
