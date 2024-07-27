package com.factorypattern;

public class FactoryPattern {
    public static void main(String[] args) {
    	
    	System.out.println("***Factory Pattern***");
    	
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle vehicle1 = vehicleFactory.getVehicle("CAR");
        
        if (vehicle1 != null) {
        	vehicle1.drive();
        }
        else {
            System.out.println("Failed to create vehicle of type CAR");
        }

        Vehicle vehicle2 = vehicleFactory.getVehicle("MOTORCYCLE");

        if (vehicle2 != null) {
            vehicle2.drive();
        }
        else {
            System.out.println("Failed to create vehicle of type MOTORCYCLE");
        }
        
        Vehicle vehicle3 = vehicleFactory.getVehicle("Truck");

        if (vehicle3 != null) {
            vehicle3.drive();
        }
        else {
            System.out.println("Failed to create vehicle of type Truck");
        }
    }
}
