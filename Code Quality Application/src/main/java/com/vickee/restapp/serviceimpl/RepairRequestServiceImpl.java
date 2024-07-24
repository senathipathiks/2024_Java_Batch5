package com.vickee.restapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.vickee.restapp.model.RepairRequest;
import com.vickee.restapp.repository.RepairRequestRepo;
import com.vickee.restapp.service.RepairRequestService;


@Service
public class RepairRequestServiceImpl implements RepairRequestService {
	
	
	RepairRequestRepo repo;
	
	public RepairRequestServiceImpl(RepairRequestRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void addRepair(RepairRequest repair) {
		repo.save(repair);
		
	}
	
	@Override
	public RepairRequest getRepair(int oid) {
	    Optional<RepairRequest> repairOptional = repo.findById(oid);
	    return repairOptional.orElse(null);
	}

	@Override
	public List<RepairRequest> getAllRepair() {
		return repo.findAll();
	}

	@Override
	public void updateRepair(RepairRequest repair) {
		repo.save(repair);
		
	}

	@Override
	public void deleteRepair(int oid) {
		repo.deleteById(oid);
	}

	@Override
	public List<Integer> getAllOids() {
		return repo.fetAllOids();
	}


}
