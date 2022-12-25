package com.example.immatriculationservicequery.services;

import com.example.immatriculationservicequery.entities.Vehicle;
import com.example.immatriculationservicequery.repositories.VehicleRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.queryhandling.QueryHandler;
import org.sid.coreapi.dtos.VehicleRegistrationResponseDTO;
import org.sid.coreapi.query.getVehicleRegistrationQuery;
import org.sid.exceptions.VehicleNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class VehicleRegistrationQueryHandler {
    private VehicleRepository vehicleRepository;
    @QueryHandler
    public VehicleRegistrationResponseDTO handler(getVehicleRegistrationQuery getVehicleRegistrationQuery) throws VehicleNotFoundException {
        Vehicle vehicle = vehicleRepository.findByRegistrationNum(getVehicleRegistrationQuery.getMatriculation()).orElseThrow(()-> new VehicleNotFoundException(String.format("vehicle %s not found", getVehicleRegistrationQuery.getMatriculation())));
        VehicleRegistrationResponseDTO vehicleRegistrationResponseDTO = new VehicleRegistrationResponseDTO();
        vehicleRegistrationResponseDTO.setBrand(vehicle.getBrand());
        vehicleRegistrationResponseDTO.setRegistrationNum(vehicle.getRegistrationNum());
        vehicleRegistrationResponseDTO.setHorsepower(vehicle.getHorsepower());
        vehicleRegistrationResponseDTO.setModel(vehicle.getModel());
        vehicleRegistrationResponseDTO.setOwnerCIN(vehicle.getOwner().getCIN());
        vehicleRegistrationResponseDTO.setOwnerBirthDate(vehicle.getOwner().getBirthDate());
        vehicleRegistrationResponseDTO.setOwnerName(vehicle.getOwner().getName());
        return vehicleRegistrationResponseDTO;
    }
}
