package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Admin;
import java.util.List;


@Repository
public interface AdminRepository extends JpaRepository<Admin, String>
{

	Admin findByUsernameAndPassword(String username, String password);
}
