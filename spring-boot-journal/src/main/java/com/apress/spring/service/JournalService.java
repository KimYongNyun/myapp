package com.apress.spring.service;

import java.text.ParseException;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.apress.spring.domain.Journal;
import com.apress.spring.repository.JournalRepository;

@Service
public class JournalService {
	private static final Logger log = LoggerFactory.getLogger(JournalService.class);
	
	@Autowired
	JournalRepository repo;
	
	public void insetData() throws ParseException {
		log.info(">테이블 생성");
		repo.save(new Journal("스프링 부트 입문 ", " 오늘부터 스프링 부트를 배웠다 ", "01/01/2016"));
		 
	}
	
    public List<Journal> findAll(){
    	 return repo.findAll();
    }
}
