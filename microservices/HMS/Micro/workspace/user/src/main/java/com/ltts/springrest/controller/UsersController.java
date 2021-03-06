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

import com.ltts.springrest.model.Users;
import com.ltts.springrest.service.UsersService;

@RestController  
public class UsersController   
{  
//autowire the BooksService class  
@Autowired  
UsersService usersService;  
//creating a get mapping that retrieves all the books detail from the database   
@GetMapping("/user")  
private List<Users> getAllUsers()   
{  
return usersService.getAllUsers();  
}  
//creating a get mapping that retrieves the detail of a specific book  
@GetMapping("/user/{userid}")  
private Users getBooks(@PathVariable("userid") int bookid)   
{  
return usersService.getusersById(bookid);  
}  
//creating a delete mapping that deletes a specified book  
@DeleteMapping("/user/{userid}")  
private void deleteBook(@PathVariable("userid") int userid)   
{  
usersService.delete(userid);  
}  
//creating post mapping that post the book detail in the database  
@PostMapping("/users")  
private int saveBook(@RequestBody Users users)   
{  
usersService.saveOrUpdate(users);  
return users.getUserid();  
}  
//creating put mapping that updates the book detail   
@PutMapping("/users")  
private Users update(@RequestBody Users users)   
{  
usersService.saveOrUpdate(users);  
return users;  
}  
}  