package com.tombnb22.dao;

import java.util.List;

import com.tombnb22.dao.GenericDAO;
import com.tombnb22.domain.User;

import java.util.Optional;




public interface UserDAO extends GenericDAO<User, Integer> {
  
	List<User> findAll();
	






}


