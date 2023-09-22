package com.capstone.CapstoneProject.repositories;

import com.capstone.CapstoneProject.models.Employee;
import com.capstone.CapstoneProject.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
