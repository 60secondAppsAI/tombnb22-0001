package com.tombnb22.dao;

import java.util.List;

import com.tombnb22.dao.GenericDAO;
import com.tombnb22.domain.Listing;





public interface ListingDAO extends GenericDAO<Listing, Integer> {
  
	List<Listing> findAll();
	






}


