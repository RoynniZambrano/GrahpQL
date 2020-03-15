package com.royforthewin.vehicles.Services;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.royforthewin.vehicles.repository.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleMutation implements GraphQLMutationResolver {

    private VehicleService vehicleService;

    @Autowired
    void VehicleMutation(VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }


    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }

}
