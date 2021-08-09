package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.HostelDirectory;

public interface HostelRepo extends CrudRepository<HostelDirectory, Integer> {
	
	
}
