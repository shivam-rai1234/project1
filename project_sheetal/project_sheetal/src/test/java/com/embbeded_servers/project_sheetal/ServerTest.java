package com.embbeded_servers.project_sheetal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServerTest {
	@Autowired
	private ServerRepo sr;
    @Test
    void testcases() {
    	List<ServerEntity> server=sr.getjoin(1);
    	int ans=server.get(0).getServer_id();
    	String ans2=server.get(0).getServer_name();
    	assertEquals(ans,1);
    	assertEquals(ans2,"Tomcat");
    	
    }
}
