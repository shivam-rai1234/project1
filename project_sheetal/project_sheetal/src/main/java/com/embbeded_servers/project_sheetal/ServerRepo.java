package com.embbeded_servers.project_sheetal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ServerRepo extends JpaRepository<ServerEntity, Integer>{

	@Query(value="select * from emdserver i where i.server_id = ?1",nativeQuery=true)
	List<ServerEntity> getjoin(Integer server_id);
}
