package com.example.iceFrog.model;
import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "sale")

public class sale {

	@NotBlank
	@Column(unique = true)
	private LocalDate date ;
	
	

	@NotBlank
	@Column(unique = true)
	private short loc_id;
	
	private int sales;
	
	
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public short getLoc_id() {
		return loc_id;
	}

	public void setLoc_id(short loc_id) {
		this.loc_id = loc_id;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}
	
}
