package org.example.graphql.service;

import org.example.graphql.model.Vehicle;
import org.example.graphql.model.Wheel;
import org.example.graphql.repository.VehicleRepository;
import org.example.graphql.repository.WheelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WheelService {

    private final WheelRepository wheelRepository;

    private final VehicleRepository vehicleRepository;

    @Autowired
    public WheelService(WheelRepository wheelRepository, VehicleRepository vehicleRepository) {
        this.wheelRepository = wheelRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public List<Wheel> findAllWheels() {
        return wheelRepository.findAll();
    }

    public Integer countAllWheels() {
        return (int) wheelRepository.count();
    }

    public Wheel createWheel(final boolean isForWinter, final String maker, final int vehicleId) {
        Optional<Vehicle> vehicle = vehicleRepository.findById(vehicleId);
        return wheelRepository.save(new Wheel().setForWinter(isForWinter)
                .setMaker(maker).setVehicle(vehicle.orElse(null)));
    }

    public boolean deleteWheel(final int wheelId) {
        wheelRepository.deleteById(wheelId);
        return true;
    }
}
