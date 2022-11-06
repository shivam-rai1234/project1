package com.kpi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kpi.entity.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer>{

	@Query(value = "select product_name from Items", nativeQuery = true)
	List<String> findOnlyProductName();

}
