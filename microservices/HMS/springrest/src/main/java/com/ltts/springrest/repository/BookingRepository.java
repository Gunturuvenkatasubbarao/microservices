package com.ltts.springrest.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltts.springrest.model.Booking;


//repository that extends CrudRepository  
public interface BookingRepository extends CrudRepository<Booking, Integer>  
{  
}  
