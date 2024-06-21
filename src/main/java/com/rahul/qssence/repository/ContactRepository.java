package com.rahul.qssence.repository;

import com.rahul.qssence.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
	
	
}
