package com.example.iceFrog.model;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
@Table(name = "Geography")
public class Geography {
	@NotBlank
	@Column(unique = true)
	private short loc_id;
	
	 @Column(columnDefinition = "text")
	 private String thana;
	 @Column(columnDefinition = "text")
	 private String district;
	 @Column(columnDefinition = "text")
	 private String Division;
	
	
	public short getLoc_id() {
		return loc_id;
	}

	public void setLoc_id(short loc_id) {
		this.loc_id = loc_id;
	}

	public String getThana() {
		return thana;
	}

	public void setThana(String thana) {
		this.thana = thana;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDivision() {
		return Division;
	}

	public void setDivision(String division) {
		Division = division;
	}

	

}
