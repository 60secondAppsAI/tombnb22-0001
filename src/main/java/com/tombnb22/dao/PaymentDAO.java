package com.tombnb22.dao;

import java.util.List;

import com.tombnb22.dao.GenericDAO;
import com.tombnb22.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


