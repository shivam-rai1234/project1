package com.kpi.project1.anamproject1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailsService {
	@Autowired
	public DetailsRepo dr;
	public List<DetailsEntity>getSample(){
		ArrayList<DetailsEntity> value=new ArrayList<DetailsEntity>();
		for(DetailsEntity dt:dr.findAll()) {
			DetailsEntity temp=new DetailsEntity();
			temp.setSr_no(dt.getSr_no());
			temp.setTerms(dt.getTerms());
			temp.setDescription(dt.getDescription());
			value.add(temp);
			
		}
		return dr.findAll();
	}

}
