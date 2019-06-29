package com.whittam.ropes.service;

import com.whittam.ropes.model.Makeup;
import com.whittam.ropes.model.MakeupSearchOptions;
import com.whittam.ropes.repository.MakeupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MakeupService {

	@Autowired
	MakeupRepository makeupRepository;

	public List<Makeup> findAll() {
		return  makeupRepository.findAll();
	}

	public Makeup saveMakeup(Makeup  Makeup) {
		return  makeupRepository.save( Makeup);
	}

	public void deleteMakeup(String id) {
		 makeupRepository.delete(id);
	}
	
	public void deleteAll() {
		 makeupRepository.deleteAll();
	}

	public void saveAll(List<Makeup>  Makeup) {
		makeupRepository.save(Makeup);
	}

	public Page<Makeup> findAll(MakeupSearchOptions makeupSearchOptions) {
		Pageable request = null;
		String[] searchOptionsArr = makeupSearchOptions.getSortBy().split(",");
		request = new PageRequest(makeupSearchOptions.getCurPageNumber() - 1, 10,
				new Sort(new Sort.Order(Sort.Direction.DESC, searchOptionsArr[0]),
						new Sort.Order(Sort.Direction.ASC, searchOptionsArr[1])));

		if (makeupSearchOptions.getSearchByRef() != null && makeupSearchOptions.getSearchByRef() != "") {
			return makeupRepository.findByRef(makeupSearchOptions.getSearchByRef(), request);
		} else {
			return makeupRepository.findAll(request);
		}

	}

	public Makeup findById(String id) {
		return makeupRepository.findById(id);
	}

}
