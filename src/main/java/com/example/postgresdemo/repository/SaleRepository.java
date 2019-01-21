package com.example.postgresdemo.repository;

import com.example.postgresdemo.model.sale;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<sale, Long> {
	
	@Query(value = "SELECT\r\n" + 
			"    Calendar.date, sum(sale.sales)\r\n" + 
			"FROM\r\n" + 
			"    sale\r\n" + 
			"        JOIN\r\n" + 
			"        Calendar ON Calendar.date = sale.date\r\n" + 
			"GROUP BY Calendar.date", nativeQuery = true)
	  List<Object[]> salesByDate();
	  
	  @Query(value = "SELECT\r\n" + 
	  		"    Calendar.quarter, Calendar.day, sum(sale.sales)\r\n" + 
	  		"FROM\r\n" + 
	  		"    sale\r\n" + 
	  		"        JOIN\r\n" + 
	  		"        Calendar ON Calendar.date = sale.date\r\n" + 
	  		"GROUP BY Calendar.quarter, Calendar.day\r\n" + 
	  		"ORDER BY Calendar.quarter ASC", nativeQuery = true)
	  List<Object[]> salesByDayAndQuarter();
	  
	  @Query(value = "SELECT\r\n" + 
	  		"    Calendar.quarter,  sum(sale.sales)\r\n" + 
	  		"FROM\r\n" + 
	  		"    sale\r\n" + 
	  		"        JOIN\r\n" + 
	  		"        Calendar ON Calendar.date = sale.date\r\n" + 
	  		"GROUP BY Calendar.quarter\r\n" + 
	  		"ORDER BY Calendar.quarter ASC", nativeQuery = true)
	  List<Object[]> salesByQuarter();
	  
	  @Query(value = "SELECT\r\n" + 
	  		"    Geography.thana, sum(sale.sales)\r\n" + 
	  		"FROM\r\n" + 
	  		"    sale\r\n" + 
	  		"        JOIN\r\n" + 
	  		"        Geography ON Geography.loc_id = sale.loc_id\r\n" + 
	  		"GROUP BY Geography.thana\r\n" + 
	  		"ORDER BY sum(sale.sales) DESC\r\n" + 
	  		"\r\n" + 
	  		"", nativeQuery = true)
	  List<Object[]> salesByThana();
	
	
	
}
