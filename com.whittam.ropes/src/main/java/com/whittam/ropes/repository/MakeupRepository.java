package com.whittam.ropes.repository;

import com.whittam.ropes.model.Inventory;
import com.whittam.ropes.model.Makeup;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MakeupRepository extends MongoRepository<Makeup, String> {

	void delete(Makeup id);
	List<Makeup> findAll();
	Makeup findById(String id);
	Makeup save(Makeup id);
	Page<Makeup> findAll(Pageable request);
	@Query("{'ref': {$regex: ?0, $options: 'i' }})")
	Page<Makeup> findByRef(String ref, Pageable request);

}
