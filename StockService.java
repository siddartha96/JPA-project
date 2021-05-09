package com.jsp.jpa.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.jpa.dao.StockDao;
import com.jsp.jpa.dto.Stock;

@Service
public class StockService {
	
	
	@Autowired
	private StockDao dao;

	public List<Stock> getStockList() {
		List<Stock> stockList = new ArrayList<Stock>();
		dao.findAll().forEach(stockList::add);
		return stockList;
	}

	public Stock getStock(String id) {
		Optional<Stock> stock = dao.findById(Integer.parseInt(id));
		return stock.get();
	
	}

	public void addStock(Stock stock) {
		dao.save(stock);
	}

	public void updateStock(Stock stock, String id) {
		dao.save(stock);
		
	}

	public void deleteStock(String id) {
		
		dao.deleteById(Integer.parseInt(id));
	}

	
	public void deleteStockAll() {
		
		dao.deleteAll();
	}
}




/*Iterable<Stock> istock = dao.findAll();
for(Stock e : istock) {
	stockList.add(e);
}*/