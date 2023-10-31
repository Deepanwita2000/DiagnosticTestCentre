package com.TestCenter.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dr_id")
	private int dr_id;
	
	@Column(name = "dr_name", nullable = false)
	private String dr_name;
	
	@Column(name = "dr_email", nullable = false)
	private String dr_email;
	
	@Column(name = "specialization", nullable = false)
	private String specialization;
	
	//default const
		public Doctor() {
		}

		// Getters and setters for the fields
		public int getDr_id() {
			return dr_id;
		}

		public void setDr_id(int dr_id) {
			this.dr_id = dr_id;
		}

		public String getDr_name() {
			return dr_name;
		}

		public void setDr_name(String dr_name) {
			this.dr_name = dr_name;
		}

		public String getDr_email() {
			return dr_email;
		}

		public void setDr_email(String dr_email) {
			this.dr_email = dr_email;
		}

		public String getSpecialization() {
			return specialization;
		}

		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}

		

}
