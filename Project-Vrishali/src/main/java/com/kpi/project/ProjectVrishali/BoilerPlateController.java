package com.kpi.project.ProjectVrishali;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author VrishaliMore
 *
 */
@RestController
public class BoilerPlateController {

	@Autowired
    private BoilerPlateService bservice;
	
	@Autowired
	private BoilerPlateRepo repo;
	
	
	//Post Methods
	
	@PostMapping("/add") 
	public BoilerPlateEntity addCode(@RequestBody BoilerPlateEntity code) 
	{ 
		return bservice.saveallBoilerplate(code); 
	}

	@PostMapping("/addList")
	public List<BoilerPlateEntity> addCodeList(@RequestBody List<BoilerPlateEntity> listofcode) 
	{
		return bservice.saveCodeList(listofcode);
	}
	  
	 
	// GetMethods

	@GetMapping("/findall")
	public List<BoilerPlateEntity> findAllRecords() {
		return bservice.getCodeList(); 
	}

	@GetMapping("/findById/{id}")
	public BoilerPlateEntity findBoilerplateCodeById(@PathVariable int id)
	{
		return bservice.getById(id);
	}
	
	// the code user enter same as boilerplate code fetch here
	@GetMapping("/usermatch")
	public List<BoilerPlateEntity> getusercode() {
		return repo.userenterboilerplate();
	}
	

	//update method 
	
	  @PutMapping("/update") 
	  public BoilerPlateEntity updateCode(@RequestBody BoilerPlateEntity c) 
	  {
		  return bservice.updateCode(c); 
		  
	  }
	  
	  //Delete method
	  
	  @DeleteMapping("/delete/{id}")
	  public String deleteBoilerplatecode(@PathVariable int id) 
	  {
		  return bservice.deleteCode(id); 
		  
	  }
	  
	// in table all boiler plate records are fetch
	  
	  @GetMapping("/boilerplate") 
	  public ArrayList<String> getdata(){
		ArrayList<String> data= new ArrayList<String>();
    	for(BoilerPlateEntity bdata1:repo.findAll()) {
            data.add(bdata1.getBoilerPlate_code());
    	}	
    	return data;
     }
	 
	
}
