package com.building.Q4_Partheev_building;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BuildingControllerTest {
    
    @Autowired
    private BuildingController bc;
    
    @Test
    public void check() {
        Double expected_total_area=515833.6019999999;
        Double actual_total_area= bc.get_total_area();
        Assert.assertEquals(expected_total_area,actual_total_area);
        Double expected_floor_area=51988.1602;
        Double actual_area=bc.get_area(1);
        Assert.assertEquals(actual_area, expected_floor_area);
    }
}