package com.example.postgresdemo.controller;

import com.example.postgresdemo.model.Calendar;
import com.example.postgresdemo.repository.CalendarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
public class CalendarController {

    @Autowired
    private CalendarRepository calendarRepository;

    @GetMapping("/Calendar")
    public List<Calendar> getallCalendarsOnly() {
        return calendarRepository.findAll();
    }

    @GetMapping("Calendar/quarter/{quarterValue}")
    public List<Calendar> getCalendarsByQuarter(@PathVariable String quarterValue) {
        return calendarRepository.findByQuarter(quarterValue);
    }
    
    @GetMapping("Calendar/sale")
    public List<Object[]> getCalendarSale() {
        return calendarRepository.salesByDate();
    }
   
    
    
}