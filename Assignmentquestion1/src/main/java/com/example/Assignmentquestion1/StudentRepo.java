package com.example.Assignmentquestion1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepo extends JpaRepository<StudentRepo,Integer> {

	@Query(value="select*from student",nativeQuery=true)
  public List<StudentEntity>getall();
}
