package com.example.Project1.project1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepo extends CrudRepository<CompanyEntity, Integer> {
@Query(value="select * from company i where i.company_name = ?1",nativeQuery=true)
List<CompanyEntity> getjoin(String company_name);
}

