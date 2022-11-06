package com.building.Q4_Partheev_building;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;



@RunWith(SpringRunner.class)
@SpringBootTest
public class BuildingControllerTest {
    
    @Autowired
    private BuildingRepo br;
    
    @Test
    public void check() {
        List<BuildingEntity> emp = (List<BuildingEntity>) br.findAll();
        Assert.assertEquals(emp.size(),10);
        double expected_total_area=515833.6015625;
        BuildingController bc =new BuildingController();
        double actual_total_area= bc.get_total_area();
        Assert.assertEquals(expected_total_area,actual_total_area);
        double expected_floor_area=51988.1602;
        double actual_area=bc.get_area(1);
        Assert.assertEquals(actual_area, expected_floor_area);
    }
}