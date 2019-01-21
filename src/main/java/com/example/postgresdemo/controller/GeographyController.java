package com.example.postgresdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresdemo.model.Geography;
import com.example.postgresdemo.repository.GeographyRepository;

@RestController
public class GeographyController {

	@Autowired
    private GeographyRepository geographyRepository;

	@GetMapping("/Geography")
    public List<Geography> getallGeographyOnly() {
        return geographyRepository.findAll();
    }
	
}
