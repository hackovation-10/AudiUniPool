package com.team10.AudiUniPool;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoController {

	Fixtures Fixtures = new Fixtures();
	

	@RequestMapping("/listAuto")
	public List<Auto> list() {
		return Fixtures.getAutos();
	}

}
