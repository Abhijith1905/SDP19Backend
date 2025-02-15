package com.klef.jfsd.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Certifications;

@Repository
public interface CertificationsRepository extends JpaRepository<Certifications, Integer>
{
    List<Certifications> findByStudentId(int studentId);
    void deleteByStudentId(int studentId);
}

