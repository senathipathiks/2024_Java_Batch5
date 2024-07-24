package com.karthi.testing.service;

import java.util.List;

import com.karthi.testing.model.Request;

public interface RequestService {
	public void addOrUpdateRequest(Request request);

	public List<Request> getAllRequest();

	public void deleteRequest(int id);

	public List<Request> getAllRequestByBloodId(int id);
}
