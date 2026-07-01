package com.example.libray.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.libray.entity.LibrayryEntity;

public interface LibrayRepository extends JpaRepository<LibrayryEntity, Integer> {

}
