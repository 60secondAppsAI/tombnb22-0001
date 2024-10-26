package com.tombnb22.dao;

import java.util.List;

import com.tombnb22.dao.GenericDAO;
import com.tombnb22.domain.ListingAmenity;





public interface ListingAmenityDAO extends GenericDAO<ListingAmenity, Integer> {
  
	List<ListingAmenity> findAll();
	






}


