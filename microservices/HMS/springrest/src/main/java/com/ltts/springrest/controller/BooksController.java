package com.ltts.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.springrest.model.Booking;

import com.ltts.springrest.service.BookingService;


@RestController  
public class BooksController   
{  
//autowire the BooksService class  
@Autowired  
BookingService bookingService;  
//creating a get mapping that retrieves all the books detail from the database   
@GetMapping("/booking")  
private List<Booking> getAllBooks()   
{  
return bookingService.getAllBooking();  
}  
//creating a get mapping that retrieves the detail of a specific book  
@GetMapping("/booking/{bookingid}")  
private Booking getBooking(@PathVariable("bookingid") int bookingid)   
{  
return bookingService.getBooksById(bookingid);  
}  
//creating a delete mapping that deletes a specified book  
@DeleteMapping("/booking/{bookingid}")  
private void deleteBooking(@PathVariable("bookingid") int bookingid)   
{  
bookingService.delete(bookingid);  
}  
//creating post mapping that post the book detail in the database  
@PostMapping("/booking")  
private int saveBooking(@RequestBody Booking booking)   
{  
bookingService.saveOrUpdate(booking);  
return booking.getBookingid();  
}  
//creating put mapping that updates the book detail   
@PutMapping("/booking")  
private Booking update(@RequestBody Booking booking)   
{  
bookingService.saveOrUpdate(booking);  
return booking;  
}  
}  