package com.kpi.project1.anamproject1;

import java.util.List;

import org.junit.Assert;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DetailsTest {
@Autowired
private DetailsService ds;
@Test
public void contextLoads() {
	List<DetailsEntity> detail=ds.getSample();
	Assert.assertEquals(detail.get(0).getTerms(),"WEB");
}
}
