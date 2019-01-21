package com.example.postgresdemo.repository;

import com.example.postgresdemo.model.Calendar;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, Long> {
	  List<Calendar> findAll();
	  
	  @Query(value = "SELECT * FROM Calendar", nativeQuery = true)
	  List<Calendar> findByQuarter(String quartervalue);
	  
	  @Query(value = "SELECT date,district FROM Calendar,Geography", nativeQuery = true)
	  List<Object[]> salesByDate();
	  
	  
}