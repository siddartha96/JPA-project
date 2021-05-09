package com.jsp.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.jpa.dto.Stock;
import com.jsp.jpa.service.StockService;

@RestController
public class StockController {

	@Autowired
	private StockService service;

	@RequestMapping(value = "/stocks", method = RequestMethod.GET) 
	public List<Stock> getStockList() {

		return service.getStockList();
	}

	@RequestMapping("/stocks/{id}")
	public Stock getStock(@PathVariable String id) {

		return service.getStock(id);
	}

	@RequestMapping(value = "/stocks", method = RequestMethod.POST)
	public void addStock(@RequestBody Stock stock) {

		service.addStock(stock);
	}

	@RequestMapping(value = "/stocks/{id}", method = RequestMethod.PUT)
	public void updateStock(@RequestBody Stock stock, @PathVariable String id) {

		service.updateStock(stock, id);
	}

	@RequestMapping(value = "/stocks/{id}", method = RequestMethod.DELETE)
	public void deleteStock(@PathVariable String id) {

		service.deleteStock(id);
	}

}
