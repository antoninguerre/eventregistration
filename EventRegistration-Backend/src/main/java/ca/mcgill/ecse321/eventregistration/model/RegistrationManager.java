package ca.mcgill.ecse321.eventregistration.model;

import java.util.*;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.Entity;

@Entity
public class RegistrationManager {


	private List<Person> person;
	
	@OneToMany(cascade = {CascadeType.ALL})
	public List<Person> getPersons() {
		return this.person;
	}
	
	public void setPerson(List<Person> persons) {
		this.person = persons;
	}
	
	
	
	private List<Registration> registration;
	
	@OneToMany(cascade = {CascadeType.ALL})
	public List<Registration> getRegistrations() {
		return this.registration;
	}
	
	public void setRegistration(List<Registration> registrations) {
		this.registration = registrations;
	}
	
	
	
	private List<Event> event;

	@OneToMany(cascade = {CascadeType.ALL})
	public List<Event> getEvents() {
		return this.event;
	}
	
	public void setEvent(List<Event> events) {
		this.event = events;
	}

	

}
