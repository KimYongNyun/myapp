package com.apress.spring.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apress.spring.domain.Journal;

public interface JournalRepository extends JpaRepository <Journal, Long>{
	
	List<Journal> FindByCreatedAfter(Date date);
	
	
}
