package controller;


import com.example.iceFrog.model.Calendar;
import repos.CalendarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
public class CalendarController {

	@Autowired
    private CalendarRepo calendarRepo;
	
	@GetMapping("/Calendar")
    public Page<Calendar> getCalendar(Pageable pageable) {
        return calendarRepo.findAll(pageable);
    }
	
}
