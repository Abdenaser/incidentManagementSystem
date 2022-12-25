package com.example.immatriculationservicequery.repositories;

import com.example.immatriculationservicequery.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,String> {
    Optional<Vehicle> findByRegistrationNum(String registrationNum);
}
