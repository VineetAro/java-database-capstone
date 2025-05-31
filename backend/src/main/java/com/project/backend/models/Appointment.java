package com.project.backend.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@NotNull
	private Doctor doctor;
	
	@NotNull
	@ManyToOne
	private Patient patient;
	
	@NotNull
	@Future(message = "Appointment time must be in the future")
	private LocalDateTime appointmentTime;
	
	@NotNull
	private int status;
	
	
	public long getID() {
		return id;
	}
	
	public void setID(long id) {
		this.id = id;
	}
	
	public Doctor getDoctor() {
		return doctor;
	}
	
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	public Patient getPtient() {
		return this.patient;
	}
	
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	public int getStatus() {
		return status; 
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	 public LocalDateTime getAppointmentTime() {
	        return appointmentTime;
	    }

	    public void setAppointmentTime(LocalDateTime appointmentTime) {
	        this.appointmentTime = appointmentTime;
	    }

	
	 @Transient
	    public LocalDateTime getEndTime() {
	        return appointmentTime.plusHours(1);
	    }

	    @Transient
	    public LocalDate getAppointmentDate() {
	        return appointmentTime.toLocalDate();
	    }

	    @Transient
	    public LocalTime getAppointmentTimeOnly() {
	        return appointmentTime.toLocalTime();
	    }
}

