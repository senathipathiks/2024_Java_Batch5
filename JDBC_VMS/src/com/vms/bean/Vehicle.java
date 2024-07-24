package com.vms.bean;

public class Vehicle 
{
	  int Vehicleid;
	  String VehicleBrandName;
	  String VehicleOwnerName;
	  String VehicleServiceList;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int vehicleid, String vehicleBrandName, String vehicleOwnerName, String vehicleServiceList) {
		super();
		Vehicleid = vehicleid;
		VehicleBrandName = vehicleBrandName;
		VehicleOwnerName = vehicleOwnerName;
		VehicleServiceList = vehicleServiceList;
	}
	public int getVehicleid() {
		return Vehicleid;
	}
	public void setVehicleid(int vehicleid) {
		Vehicleid = vehicleid;
	}
	public String getVehicleBrandName() {
		return VehicleBrandName;
	}
	public void setVehicleBrandName(String vehicleBrandName) {
		VehicleBrandName = vehicleBrandName;
	}
	public String getVehicleOwnerName() {
		return VehicleOwnerName;
	}
	public void setVehicleOwnerName(String vehicleOwnerName) {
		VehicleOwnerName = vehicleOwnerName;
	}
	public String getVehicleServiceList() {
		return VehicleServiceList;
	}
	public void setVehicleServiceList(String vehicleServiceList) {
		VehicleServiceList = vehicleServiceList;
	}
}
