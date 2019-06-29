package com.whittam.ropes.controller;

import com.whittam.ropes.model.Makeup;
import com.whittam.ropes.model.MakeupSearchOptions;
import com.whittam.ropes.service.MakeupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MakeupController {

	@Autowired
	private MakeupService makeupService;

	// Returns the whole list of mak	eup

	@RequestMapping(value = "/makeups-all", method = RequestMethod.GET)
	public ResponseEntity<List<Makeup>> getAll() {
		return new ResponseEntity<List<Makeup>>(makeupService.findAll(), HttpStatus.OK);
	}

	@RequestMapping(value = "/makeup/{id}", method = RequestMethod.GET)
	public ResponseEntity<Makeup> getById(@PathVariable("id") String id) {
		return new ResponseEntity<Makeup>(makeupService.findById(id), HttpStatus.OK);
	}

	@RequestMapping(value = "/makeups", method = RequestMethod.POST)
	public ResponseEntity<Page<Makeup>> pageableGetAll(@RequestBody MakeupSearchOptions makeupSearchOptions) {
		if (makeupSearchOptions.getCurPageNumber() != null && makeupSearchOptions.getCurPageNumber() != null) {
			return new ResponseEntity<Page<Makeup>>(makeupService.findAll(makeupSearchOptions), HttpStatus.OK);
		}
		return new ResponseEntity<Page<Makeup>>(HttpStatus.BAD_REQUEST);
	}

	// POST method to save to mongoDB.

	@RequestMapping(value = "/save/makeup", method = RequestMethod.POST)
	public ResponseEntity<List<Makeup>> saveMakeup(@RequestBody Makeup makeup) {
			makeupService.saveMakeup(makeup);
		return new ResponseEntity<>(makeupService.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/saveAll/makeup", method = RequestMethod.POST)
	public ResponseEntity<?> saveAllMakeup(@RequestBody List<Makeup> makeup) {
		makeupService.saveAll(makeup);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	// DELETE the entity

	@RequestMapping(value = "/delete/makeup", method = RequestMethod.POST)
	public ResponseEntity<?> deleteMakeup(@PathVariable String id) {
		makeupService.deleteMakeup(id);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
	@RequestMapping(value = "/delete-all/makeup", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteAllMakeup() {
		makeupService.deleteAll();
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

}
