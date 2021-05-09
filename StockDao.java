package com.jsp.jpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jsp.jpa.dto.Stock;


@Repository
public interface StockDao extends CrudRepository<Stock, Integer>{

}