package ca.mcgill.ecse321.eventregistration.dao;

import ca.mcgill.ecse321.eventregistration.model.Person;
import org.springframework.data.repository.CrudRepository;

import ca.mcgill.ecse321.eventregistration.model.Event;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface EventRepository extends CrudRepository<Event, String> {

	Event findEventByName(String name);



}