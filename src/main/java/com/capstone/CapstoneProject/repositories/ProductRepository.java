package com.capstone.CapstoneProject.repositories;

import com.capstone.CapstoneProject.models.Employee;
import com.capstone.CapstoneProject.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
