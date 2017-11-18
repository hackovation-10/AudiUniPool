package com.team10.AudiUniPool;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleController {

	Fixtures fixtures = new Fixtures();

	@RequestMapping("/listSchedule")
	public List<Schedule> list() {

		return fixtures.getSchedules();
	}


	@RequestMapping(value="/requestAuto"/*, method = RequestMethod.POST*/)
	public List<Schedule> requestAuto(
			@RequestParam(value="user") Long userId,
			@RequestParam(value="auto") Long autoId
			) {
		
		User user = fixtures.users.stream().filter(u -> u.getId() == userId).findFirst().get();
		Auto auto = fixtures.getAutos().stream().filter(a -> a.getId() == autoId).findFirst().get();
		auto.setAvailability(false);
		Schedule schedule = new Schedule(1, user, auto, "18/11/2017 20:10", "18/11/2017 22:10");
		fixtures.getSchedules().add(schedule);
		return list();
	}





}

