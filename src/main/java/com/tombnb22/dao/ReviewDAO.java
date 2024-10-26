package com.tombnb22.dao;

import java.util.List;

import com.tombnb22.dao.GenericDAO;
import com.tombnb22.domain.Review;





public interface ReviewDAO extends GenericDAO<Review, Integer> {
  
	List<Review> findAll();
	






}


