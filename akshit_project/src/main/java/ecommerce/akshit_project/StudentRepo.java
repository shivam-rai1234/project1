package ecommerce.akshit_project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ecommerce.akshit_project.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>
{

}
