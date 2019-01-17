package controller;


import com.example.iceFrog.model.Geography;
import repos.GeographyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
public class GeographyController {

	@Autowired
	GeographyRepo geographyRepo;
	@GetMapping("/Geography")
    public Page<Geography> getGeography(Pageable pageable) {
        return geographyRepo.findAll(pageable);
    }
}
