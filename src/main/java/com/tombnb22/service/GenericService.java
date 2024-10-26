package com.tombnb22.service;

import com.tombnb22.dao.GenericDAO;

public interface GenericService<T, ID> {

    abstract GenericDAO<T, ID> getDAO();

    T getById(Integer id) ;

}