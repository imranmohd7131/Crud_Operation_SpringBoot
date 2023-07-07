package com.tuespot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tuespot.entity.StudentFormEntity;

@Repository
public interface StudentFormRepo  extends JpaRepository<StudentFormEntity, Long> {

}
