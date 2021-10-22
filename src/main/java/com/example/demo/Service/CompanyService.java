package com.example.demo.Service;

import java.util.List;

import com.example.demo.entity.ProjectRecord;



public interface CompanyService {

	ProjectRecord insertProjectDetail(ProjectRecord projectRecord);
     List<ProjectRecord> displayAllProject();
	ProjectRecord recordGetById(int pro_id);
	void recordDeleteById(int pro_id);
	int recordUpdateById(String pro_name,int pro_id);
	ProjectRecord updatedRecord(ProjectRecord projectRecord);
	String DisplayEmpById(int pro_id);
	

}
