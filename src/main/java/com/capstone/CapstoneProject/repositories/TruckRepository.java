package com.capstone.CapstoneProject.repositories;

import com.capstone.CapstoneProject.models.Employee;
import com.capstone.CapstoneProject.models.Truck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepository extends JpaRepository<Truck, Long> {
}
