package com.nerchuko.hibernateimpl.Repository;

import com.nerchuko.hibernateimpl.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
}
