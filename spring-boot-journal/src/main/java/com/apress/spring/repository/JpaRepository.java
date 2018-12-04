package com.apress.spring.repository;

import java.io.Serializable;
import java.util.List;

import org.hibernate.annotations.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface JpaRepository<T, ID extends Serializable> extends PagingAndSortingRepository<T, ID> {

	List<T> findAll();
	
	List<T> findAll(Sort sort);
	
	List<T> findall(Iterable<ID> ids);
	
	<S extends T> List<S> save(Iterable<S> entities);
	
	void flush();
	
	<S extends T> S saveAndFlush(S entity);
	
	void deleteInBatch(Iterable<T> entities);
	
	void deleteAllInBatch();
	
	T getOne(ID id);
	
	
	
}
