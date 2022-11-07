package com.example.Project1.project1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
	@Autowired
    private CompanyRepo cr;
	
	@GetMapping("/ceoofcompany")
	
	public List<String> getid(){
		ArrayList<String> cname=new ArrayList<String>();
    	for(CompanyEntity emt:cr.findAll()) {
    		cname.add(emt.getCeo_of_company()); 
    		}
    	return cname;
	}
	
    @GetMapping("/nooftimesspringbootused")
	
	public List<Integer> getcompanyid(){
		ArrayList<Integer> cid=new ArrayList<Integer>();
    	for(CompanyEntity emt:cr.findAll()) {
    		cid.add(emt.getNo_of_times_spring_boot_used()); 
    		}
    	return cid;
    }
    
    @GetMapping("/companyname")
	
	public List<String> getcompanyname(){
		ArrayList<String> coname=new ArrayList<String>();
    	for(CompanyEntity emt:cr.findAll()) {
    		coname.add(emt.getCompany_name()); 
    		}
    	return coname;
    }
    
    
    @GetMapping("/companydetails")
	
	public ArrayList<CompanyEntity> getcompanydetails(){
    	ArrayList<CompanyEntity> transformedvalues=new ArrayList<CompanyEntity>();
    
		
		for(CompanyEntity emt:cr.findAll()) {
    		CompanyEntity temp=new CompanyEntity();
    		temp.setCompany_id(emt.getCompany_id());
    		temp.setCompany_name(emt.getCompany_name());
    		temp.setCeo_of_company(emt.getCeo_of_company());
    		temp.setNo_of_times_spring_boot_used(emt.getNo_of_times_spring_boot_used());

    		transformedvalues.add(temp);
		}
		return transformedvalues;
    }
    @GetMapping("/company/{company_name}")
	public List<CompanyEntity> joincompanyname(@PathVariable String company_name){
		return cr.getjoin(company_name);
	}
    
    	
}

    


    
    
    
    
    

	
	
	
	
	
   