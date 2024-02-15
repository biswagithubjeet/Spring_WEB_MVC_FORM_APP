package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
