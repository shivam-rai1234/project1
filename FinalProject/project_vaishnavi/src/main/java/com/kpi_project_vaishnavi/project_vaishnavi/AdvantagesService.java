package com.kpi_project_vaishnavi.project_vaishnavi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdvantagesService 
{
	@Autowired
	private AdvantagesRepo arv;
	
	public List<AdvantagesEntity> getser()
	{
		return arv.findAll();
	}
	
	public List<AdvantagesEntity> getser1()
	{
		ArrayList<AdvantagesEntity> transformedvalues= new ArrayList<AdvantagesEntity>();
		for(AdvantagesEntity ae:arv.findAll())
		{
			AdvantagesEntity temp=new AdvantagesEntity();
			temp.setId(ae.getId());
			temp.setField_name(ae.getField_name());
			temp.setAdvantage_1(ae.getAdvantage_1());
			temp.setAdvantage_2(ae.getAdvantage_2());
			temp.setAdvantage_3(ae.getAdvantage_3());
			
			transformedvalues.add(temp);
		}
		return arv.findAll();
	}

}


