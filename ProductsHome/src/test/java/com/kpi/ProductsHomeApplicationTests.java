package com.kpi;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kpi.entity.Items;
import com.kpi.repository.ItemsRepository;
import com.kpi.service.ItemsService;

@SpringBootTest
class ProductsHomeApplicationTests {

	@Autowired
	ItemsService service;
	
	Items item;
	
	@Test
	void contextLoads() {
		
		String valueAtZero = "One Plus Nord CE 2 5G";
		
		assertEquals(15, service.getOnlyProductList().size());				// Not recommend usage just here for my testing purpose refer the below test function.
		assertThat(service.getOnlyProductList().get(0)).isEqualTo(valueAtZero);
	}

}
