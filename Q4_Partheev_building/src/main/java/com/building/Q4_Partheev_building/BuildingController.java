package com.building.Q4_Partheev_building;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildingController {
	@Autowired
	public BuildingRepo br;
	@GetMapping("/{floor_number}")
	public Double get_area(@PathVariable int floor_number) {
		Double Floor_area=(double) 0;
		for(BuildingEntity be:br.findAll()) {
			if(be.getFloor_num()==floor_number) {
				Floor_area=be.getFloor_area();
			}
		}
		return Floor_area;
		
	}
	@GetMapping("/total")
	public Double get_total_area() {
		Double total=(double) 0;
		for(BuildingEntity be:br.findAll()) {
			total+=be.getFloor_area();
		}
		return total;
	}
}
