package com.kpi.project.ProjectVrishali;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author VrishaliMore
 *
 */
@Service
public class BoilerPlateService {

	@Autowired
	private BoilerPlateRepo brepo;
	
	// return all records in table
	public List<BoilerPlateEntity> getallCode(){
	 return brepo.findAll();
	}
	
	// save the code
	public BoilerPlateEntity saveallBoilerplate(BoilerPlateEntity code) 
	{ 
		return brepo.save(code); 
	}
	
	 public List<BoilerPlateEntity> saveCodeList(List<BoilerPlateEntity> boilerplate)
	 {
		 return brepo.saveAll(boilerplate);
	 }
	 
	 public List<BoilerPlateEntity> getCodeList(){
			return brepo.findAll(); 
		}
		
	  public BoilerPlateEntity getById(int id)
	  { 
			return  brepo.findById(id).orElse(null);
	  }	
	  
	  // to delete
	  public String deleteCode(int id) {
			
			brepo.deleteById(id);
			return "Insured Record deleted! " + id;
			
		}
	 
	// to update
	  public BoilerPlateEntity updateCode(BoilerPlateEntity p) 
	  { 
		  BoilerPlateEntity existingCode= brepo.findById(p.getId()).orElse(null);
	     existingCode.setAppliction_name(p.getAppliction_name()); 
	     existingCode.setBoilerPlate_code(p.getBoilerPlate_code());
	     existingCode.setReduced_Code(p.getReduced_Code());
	     existingCode.setReduce_Method(p.getReduce_Method());
	  
	  return brepo.save(existingCode); }
	 

}