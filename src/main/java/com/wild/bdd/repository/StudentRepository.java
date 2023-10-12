package com.wild.bdd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wild.bdd.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
