package com.example.postgresdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.postgresdemo.repository.SaleRepository;

@RestController

public class SaleController {

	@Autowired
	private SaleRepository saleRepository;

	@GetMapping("Sales/date")
    public List<Object[]> getSalesbyDate() {
        return saleRepository.salesByDate();
    }
    
    @GetMapping("Sales/day/quarter")
    public List<Object[]> getSalesbyDayAndQuarter() {
        return saleRepository.salesByDayAndQuarter();
    }
    
    
    @GetMapping("Sales/quarter")
    public List<Object[]> getSalesbyQuarter() {
        return saleRepository.salesByQuarter();
    }
	
    
    @GetMapping("Sales/thana")
    public List<Object[]> getSalesByThana() {
        return saleRepository.salesByThana();
    }
	
	
	
	
}
