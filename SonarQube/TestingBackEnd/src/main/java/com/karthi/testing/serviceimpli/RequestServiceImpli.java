package com.karthi.testing.serviceimpli;

import java.util.List;

import org.springframework.stereotype.Service;

import com.karthi.testing.model.Request;
import com.karthi.testing.repository.RequestRepo;
import com.karthi.testing.service.RequestService;

@Service
public class RequestServiceImpli implements RequestService {

	RequestRepo requestRepo;

	public RequestServiceImpli(RequestRepo requestRepo) {
		super();
		this.requestRepo = requestRepo;
	}

	@Override
	public void addOrUpdateRequest(Request request) {
		requestRepo.save(request);
	}

	@Override
	public void deleteRequest(int id) {
		requestRepo.deleteById(id);
	}

	@Override
	public List<Request> getAllRequest() {
		return requestRepo.findAll();
	}

	@Override
	public List<Request> getAllRequestByBloodId(int id) {
		return requestRepo.findByBloodId(id);
	}
}
