package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CompanyRepo;
import com.example.demo.entity.ProjectRecord;

@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	CompanyRepo companyRepo;
	
	@Override
	public ProjectRecord insertProjectDetail(ProjectRecord projectRecord) {
		return companyRepo.save(projectRecord);
	}

	@Override
	public ProjectRecord recordGetById(int pro_id) {
		return companyRepo.findById(pro_id).get();
	}
	@Override
	public List<ProjectRecord> displayAllProject() {
		return companyRepo.findAll();
	}
	@Override
	public void recordDeleteById(int pro_id) {
		companyRepo.deleteById(pro_id);	
	}
	@Override
	public int recordUpdateById(String pro_name,  int pro_id) {
	    companyRepo.updateById(pro_name,pro_id);
	    return 1;
	  
	}

	@Override
	public ProjectRecord updatedRecord(ProjectRecord projectRecord) {
		return companyRepo.save(projectRecord);
	}
	@Override
	public String DisplayEmpById(int pro_id) {
		return companyRepo.displayProMemberById(pro_id);
	}}
