package com.team10.AudiUniPool;

import java.util.Arrays;
import java.util.List;

public class Fixtures {
	
	Auto v1 = new Auto(1, "a1", "123", true);
	Auto v2 = new Auto(2, "a8", "Cr", true);
	Auto v3 = new Auto(3, "a3", "321", false);
	Auto v4 = new Auto(4, "q7", "asd", false);
	Auto v5 = new Auto(5, "a6", "tyu", false);
	Auto v6 = new Auto(6, "a5", "zxc", false);
	
	User julia = new User(1, "Julia", "B");
	User filipe = new User(2, "Filipe", "B");
	User jean = new User(3, "Jean", "A");
	User joseph = new User(4, "Joseph", "BE");
	User mark = new User(5, "Mark", "B");

	
	Schedule monday = new Schedule(1, julia, v1, "02/12/2017 - 8:00AM", "02/12/2017 - 12:00AM");
	List<Auto> cars;
	List<User> users;
	List<Schedule> schedules;
	
	public void loadData(){
		cars = Arrays.asList(v1,v2,v3,v4,v5,v6);
		users = Arrays.asList(julia, filipe, jean, joseph, mark);
		schedules = Arrays.asList(monday);

	}
	
	public List<Auto> getAutos(){
		return cars;
	}
	public List<User> getUsers(){
		return users;
	}
	
	public List<Schedule> getSchedules(){
		return schedules;
	}

}
