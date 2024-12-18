package com.klef.jfsd.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>
{
	List<Project> findByStudentId(int studentId);
	
    long countByStudentId(int studentId);
    void deleteByStudentId(int studentId);

}
