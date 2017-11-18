package com.team10.AudiUniPool;

public class Schedule {
	private final long id;
	private final Auto auto;
	private final String startingDate;
	private final String endingDate;
	private User user;

	public Schedule(long id, User user, Auto auto, String startingDate, String endingDate) {
		this.id = id;
		this.auto = auto;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public String getStartingDate() {
		return startingDate;
	}

	public String getEndingDate() {
		return endingDate;
	}

	public Auto getAuto() {
		return auto;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}

