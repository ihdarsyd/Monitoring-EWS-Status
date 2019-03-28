package com.task.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.task.report.entity.Account;


@RepositoryRestResource(path = "/repo")
@CrossOrigin(origins = "http://localhost:4200")
public interface AccountRepository extends JpaRepository<Account,String> {
	
}