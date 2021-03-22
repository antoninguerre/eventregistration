package ca.mcgill.ecse321.eventregistration.model;

import java.util.*;
import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Entity;

@Entity
public class RegistrationManager {

	@Id
	int id;

	private List<Person> persons;
	
	@OneToMany(cascade = {CascadeType.ALL})
	public List<Person> getPersons() {
		return this.persons;
	}
	
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
	
	
	private List<Registration> registrations;
	
	@OneToMany(cascade = {CascadeType.ALL})
	public List<Registration> getRegistrations() {
		return this.registrations;
	}
	
	public void setRegistrations(List<Registration> registrations) {
		this.registrations = registrations;
	}
	
	
	
	private List<Event> events;

	@OneToMany(cascade = {CascadeType.ALL})
	public List<Event> getEvents() {
		return this.events;
	}
	
	public void setEvents(List<Event> events) {
		this.events = events;
	}

	

}
