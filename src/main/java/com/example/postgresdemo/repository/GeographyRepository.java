package com.example.postgresdemo.repository;


import com.example.postgresdemo.model.Calendar;
import com.example.postgresdemo.model.Geography;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeographyRepository extends JpaRepository<Geography, Long> {
	
	List<Geography> findAll();
}
