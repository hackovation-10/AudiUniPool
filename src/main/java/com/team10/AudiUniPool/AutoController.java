package com.team10.AudiUniPool;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoController {

	@Autowired
	Fixtures Fixtures;

	@RequestMapping("/listAuto")
	public List<Auto> list() {
		return Fixtures.getAutos();
	}

}
