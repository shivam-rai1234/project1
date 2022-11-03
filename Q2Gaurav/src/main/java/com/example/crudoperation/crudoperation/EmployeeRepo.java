package com.example.crudoperation.crudoperation;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<EmployeeEntity, Integer> {

}
