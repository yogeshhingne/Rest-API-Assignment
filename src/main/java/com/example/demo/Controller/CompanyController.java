package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.CompanyService;
import com.example.demo.entity.ProjectRecord;
import java.util.List;
@RestController
public class CompanyController {
	
	@Autowired
    CompanyService companyService;

	
@PostMapping("employee")
	ProjectRecord insert(@RequestBody ProjectRecord projectRecord) {
		return companyService.insertProjectDetail(projectRecord);
	}
@GetMapping("employee")
List<ProjectRecord> getDetail(@RequestBody ProjectRecord projectRecord){
	return companyService.displayAllProject();
}
@GetMapping("employee/{pro_id}")
  ProjectRecord getRecordById(@PathVariable int pro_id) {
	return companyService.recordGetById(pro_id);
}
@DeleteMapping("employee/{pro_id}")
void deleteRecordById(@PathVariable int pro_id) {
	companyService.recordDeleteById(pro_id);
}
@PatchMapping("employee/update/{pro_name}/{pro_id}")
void updateRecordById(@PathVariable String pro_name,@PathVariable int pro_id ) {
    companyService.recordUpdateById(pro_name,pro_id);
}

@PutMapping("employee/updateAll")
ProjectRecord updateRecord(@RequestBody ProjectRecord projectRecord)
{
	return companyService.updatedRecord(projectRecord);
}
@GetMapping("employee/selectEmpListById/{pro_id}")
String displayEmpListById(@PathVariable int pro_id)
{
	return  companyService.DisplayEmpById(pro_id);
}

}
