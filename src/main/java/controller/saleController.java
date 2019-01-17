package controller;


import com.example.iceFrog.model.sale;


import repos.saleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@RestController
public class saleController {

	
	@Autowired
saleRepo saleRepo;
	@GetMapping("/sale")
	 public Page<sale> getSale(Pageable pageable) {
		  return saleRepo.findAll(pageable);
		  }
	 
	 }
	

