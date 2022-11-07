package com.embbeded_servers.project_sheetal;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {
	@Autowired
    private ServerRepo sr;

	@GetMapping("/EmbeddedServer/{Server_id}")
    public List<ServerEntity> joinServerid(@PathVariable Integer Server_id){
		return sr.getjoin(Server_id);
	}

    @GetMapping("/all")
    public List<ServerEntity> getall(){
    	ArrayList<ServerEntity> transformedvalues=new ArrayList<ServerEntity>();
    	for(ServerEntity emt:sr.findAll()) {
    		ServerEntity temp=new ServerEntity();
		    temp.setServer_id(emt.getServer_id());
		    temp.setServer_name(emt.getServer_name());
		    transformedvalues.add(temp);
    	}
		return transformedvalues;
    }

}