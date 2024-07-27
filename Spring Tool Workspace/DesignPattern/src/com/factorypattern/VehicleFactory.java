package com.factorypattern;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicleType) {
    	
        if (vehicleType == null) {
            System.out.println("Vehicle type cannot be null");
            return null;
        }
        
        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();
        }
        
        else if (vehicleType.equalsIgnoreCase("MOTORCYCLE")) {
            return new Motorcycle();
        }
        
        else if(vehicleType.equalsIgnoreCase("Truc")) {
        	return new Truck();
        }
        return null;
    }
}
