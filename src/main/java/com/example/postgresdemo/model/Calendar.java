package com.example.postgresdemo.model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Calendar")
public class Calendar implements Serializable {
	@NotBlank
	@Column(unique = true)
	@Id
	private LocalDate date ;
	
	@Column(columnDefinition = "text")
	private String day;
	@Column(columnDefinition = "text")
	private String month;
	@Column(columnDefinition = "text")
	private String quarter;
	@Column(columnDefinition = "text")
	private String year;
	
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getQuarter() {
		return quarter;
	}

	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	
	
}
