package com.building.Q4_Partheev_building;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="building")
public class BuildingEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer floor_num;
	private Double floor_area;
	public Integer getFloor_num() {
		return floor_num;
	}
	public void setFloor_num(Integer floor_num) {
		this.floor_num = floor_num;
	}
	public Double getFloor_area() {
		return floor_area;
	}
	public void setFloor_area(Double floor_area) {
		this.floor_area = floor_area;
	}	
}
