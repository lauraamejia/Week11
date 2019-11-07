package dmacc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import dmacc.beans.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
    
    List<Student> findByName(String name);

}
