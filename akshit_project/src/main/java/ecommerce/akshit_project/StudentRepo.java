package ecommerce.akshit_project;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ecommerce.akshit_project.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>
{
	@Query(value="select * from student;",nativeQuery=true)
	public List<Student> getFinance(Integer a);
}
