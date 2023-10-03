package com.example.doctors.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.doctors.model.Appoinment;
import com.example.doctors.model.Doctor;

@RestController
public class Doctorcontroller {
	
	List<Doctor> dlist = new ArrayList<Doctor>();
	List<Appoinment> appointments = new ArrayList<Appoinment>();
	
	@PostMapping("/create")
	public String createdoctor(@RequestBody Doctor d) {
		dlist.add(d);
		return "Successfully created";
	}
	
	@GetMapping("/getdoctors")
	public List<Doctor> getDoctors(){
		return dlist;
	}
	
	@GetMapping("/getdoctor/{id}")
	public Doctor getDoctor(@PathVariable int id) {
		for(Doctor d : dlist) {
			if(d.getId()==id)
				return d;
		}
		return null;
	}
	 
	@PostMapping("/appointment")
	 public Appoinment bookAppointment(@RequestBody Appoinment appointmentRequest) {
		 int doctorId = appointmentRequest.getDoc();
		 System.out.println(appointmentRequest);
	     Doctor doctor = dlist.stream().filter(d -> d.getId()==doctorId)
	    		 .findFirst()
	    		 .orElse(null);
	     if(doctor == null)
	    	 return null;
	     
	     long bookedAppointmentsCount = appointments.stream()
             .filter(a -> a.getDoc() == doctorId)
             .count();
	     System.out.println(bookedAppointmentsCount);
		  if (bookedAppointmentsCount >= doctor.getVisitors()) {
	          return null; // Doctor is fully booked
	      }
	
	      Appoinment appointment = new Appoinment(doctorId, appointmentRequest.getPat());
	      appointments.add(appointment);
	      return appointment;
  }
	
	

}
