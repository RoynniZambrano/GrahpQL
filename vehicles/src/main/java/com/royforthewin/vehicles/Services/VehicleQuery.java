package com.royforthewin.vehicles.Services;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.royforthewin.vehicles.repository.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VehicleQuery implements GraphQLQueryResolver {


   private VehicleService vehicleService;

    @Autowired
    void VehicleQuery(VehicleService vehicleService){
       this.vehicleService = vehicleService;
    }

    public List<Vehicle> getVehicles(final int count) {
        return this.vehicleService.getAllVehicles(count);
    }
    public Optional<Vehicle> getVehicle(final int id) {
        return this.vehicleService.getVehicle(id);
    }

}
