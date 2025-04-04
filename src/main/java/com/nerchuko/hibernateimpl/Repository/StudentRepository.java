package com.nerchuko.hibernateimpl.Repository;

import com.nerchuko.hibernateimpl.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
