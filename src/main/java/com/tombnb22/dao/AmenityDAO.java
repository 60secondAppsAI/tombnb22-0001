package com.tombnb22.dao;

import java.util.List;

import com.tombnb22.dao.GenericDAO;
import com.tombnb22.domain.Amenity;





public interface AmenityDAO extends GenericDAO<Amenity, Integer> {
  
	List<Amenity> findAll();
	






}


