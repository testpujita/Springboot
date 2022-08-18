package net.javaguides.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.users;
import net.javaguides.springboot.repository.UsersRepository;
import net.javaguides.springboot.repository.UsersRepository;
import net.javaguides.springboot.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
	private UsersRepository employeeRepository;

	public UsersServiceImpl(UsersRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public users saveEmployee(users usrs) {
	  users usr=employeeRepository.save(usrs);
	  return usr;
	}
 


                                                                                               
}
