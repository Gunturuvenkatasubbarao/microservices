package com.ltts.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.springrest.model.Booking;

import com.ltts.springrest.repository.BookingRepository;


@Service  
public class BookingService   
{  
@Autowired  
BookingRepository bookingRepository;  
//getting all books record by using the method findaAll() of CrudRepository  
public List<Booking> getAllBooking()   
{  
List<Booking> booking = new ArrayList<Booking>();  
bookingRepository.findAll().forEach(booking1 -> booking.add(booking1));  
return booking;  
}  
//getting a specific record by using the method findById() of CrudRepository  
public Booking getBooksById(int id)   
{  
return bookingRepository.findById(id).get();  
}  
//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(Booking booking)   
{  
bookingRepository.save(booking);  
}  
//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(int id)   
{  
bookingRepository.deleteById(id);  
}  
//updating a record  
public void update(Booking booking, int bookingid)   
{  
bookingRepository.save(booking);  
}  
}  
