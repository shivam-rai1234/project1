package com.example.database.databaseInteraction;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Aa")
public class Controller {

	@Resource(name = "name")
	private EmpService es;

	@GetMapping
	public ArrayList<String> Show() {
		return es.getSample();
	}

}
