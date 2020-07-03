package com.example.lapse.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lapse.domain.Manager;
import com.example.lapse.repo.ManagerRepo;



@Service
public class ManagerServiceImpl implements ManagerService {
	
	@Autowired 
	ManagerRepo mrepo;

	@Override
	public ArrayList<String> findAllManagerNames() {
		return mrepo.findAllManagerNames();
	}

	
	@Override
	public Manager findManagerByName(String name) {
		ArrayList<Manager> rtnList = (ArrayList<Manager>) mrepo.findByName(name);
		if (!rtnList.isEmpty()) {
			return rtnList.get(0);
		}
		else {
			return null;
		}
	}
}
