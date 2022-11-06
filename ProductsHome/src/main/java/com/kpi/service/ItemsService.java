package com.kpi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpi.entity.Items;
import com.kpi.repository.ItemsRepository;

@Service
public class ItemsService {
	
	@Autowired
	private ItemsRepository repository;
	
	public List<Items> getProductList() {
		return repository.findAll();
	}
	
	public List<String> getOnlyProductList() {
		return repository.findOnlyProductName();
	}
}
