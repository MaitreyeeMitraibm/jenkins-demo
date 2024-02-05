package com.ibm.Jenkinsdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.Jenkinsdemo.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
