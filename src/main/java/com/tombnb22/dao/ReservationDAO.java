package com.tombnb22.dao;

import java.util.List;

import com.tombnb22.dao.GenericDAO;
import com.tombnb22.domain.Reservation;





public interface ReservationDAO extends GenericDAO<Reservation, Integer> {
  
	List<Reservation> findAll();
	






}


