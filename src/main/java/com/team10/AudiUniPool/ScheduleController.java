package com.team10.AudiUniPool;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleController {

Fixtures fixtures = new Fixtures();

	@RequestMapping("/listSchedule")
	public List<Schedule> list() {
		fixtures.loadData();
		
		return fixtures.getSchedules();
	}
}

