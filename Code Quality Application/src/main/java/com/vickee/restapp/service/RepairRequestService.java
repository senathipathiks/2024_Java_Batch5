package com.vickee.restapp.service;

import java.util.List;

import com.vickee.restapp.model.RepairRequest;


public interface RepairRequestService {
	
	public void addRepair(RepairRequest repair);
	public RepairRequest getRepair(int oid);
	public List<RepairRequest> getAllRepair();
	public void updateRepair(RepairRequest repair);
	public void deleteRepair(int oid);
	public List<Integer> getAllOids();
}
