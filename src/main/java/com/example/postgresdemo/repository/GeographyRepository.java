package com.example.postgresdemo.repository;


import com.example.postgresdemo.model.Geography;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeographyRepository extends JpaRepository<Geography, Long> {
	
	
}
