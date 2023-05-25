package com.example.SpringCRUDproject.repository;

import com.example.SpringCRUDproject.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject,Integer> {
}
