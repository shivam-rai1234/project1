package com.example.Q4;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JakartaEEController {
	

	@Autowired
	private JakartaEERepo jr;
	
	@GetMapping("/JakartaEE")
	public ArrayList<JakartaEEEntity> getSample() {
		ArrayList<JakartaEEEntity> tfv = new ArrayList<JakartaEEEntity>();
							//Set<Integer> s1 = new HashSet<Integer>();
		for (JakartaEEEntity emt : jr.findAll()) {
			JakartaEEEntity tempor = new JakartaEEEntity();
							//temp.setId(emt.getId());
			tempor.setReasons(emt.getReasons());
			tfv.add(tempor);
			
		}
		return tfv;
	}
	public static String get(@PathVariable String reasons) {
		// TODO Auto-generated method stub
		return reasons;
	}
}

