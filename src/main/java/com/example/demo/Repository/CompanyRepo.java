package com.example.demo.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ProjectRecord;

@Repository
public interface CompanyRepo extends JpaRepository<ProjectRecord, Integer>{
	
@Transactional	
@Modifying
@Query( value="UPDATE project_record  SET pro_name= ?1  WHERE pro_id= ?2", nativeQuery=true)
public void updateById(String pro_name,  int pro_id);
@Query(value="SELECT emp_list from project_record WHERE pro_id=?1",nativeQuery=true)
public String displayProMemberById(int pro_id);
}
