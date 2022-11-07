package com.FinalProject_Piyush.FinalProject_Piyush;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author PiyushBodhani
 *
 */
@RestController
public class Controller {
	@Autowired
    private dbdetailsRepository ir;
	@GetMapping("/alldb") 
    public List<dbdetailsEntity> getSample(){
        ArrayList<dbdetailsEntity> transformedvalues=new ArrayList<dbdetailsEntity>();
        for(dbdetailsEntity emt:ir.findAll()) {
        	dbdetailsEntity temp=new dbdetailsEntity();
            temp.setDb_id(emt.getDb_id());
            temp.setDb_name(emt.getDb_name());
            temp.setDb_links(emt.getDb_links());
            
            transformedvalues.add(temp);
        }
        return transformedvalues;
    }
    @GetMapping("/id={id}")
	public List<dbdetailsEntity> dbdetails(@PathVariable Integer id){

		return ir.getjoin(id);
	}
    
}
