package com.ltts.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.springrest.model.Users;

import com.ltts.springrest.repository.UsersRepository;

@Service  
public class UsersService   
{  
@Autowired  
UsersRepository usersRepository;  
//getting all books record by using the method findaAll() of CrudRepository  
public List<Users> getAllUsers()   
{  
List<Users> users = new ArrayList<Users>();  
usersRepository.findAll().forEach(users1 -> users.add(users1));  
return users;  
}  
//getting a specific record by using the method findById() of CrudRepository  
public Users getusersById(int id)   
{  
return usersRepository.findById(id).get();  
}  
//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(Users users)   
{  
usersRepository.save(users);  
}  
//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(int id)   
{  
usersRepository.deleteById(id);  
}  
//updating a record  
public void update(Users users, int userid)   
{  
usersRepository.save(users);  
}  
}  
