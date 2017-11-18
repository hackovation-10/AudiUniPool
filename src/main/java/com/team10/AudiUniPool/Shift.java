package com.team10.AudiUniPool;

public class Shift {
	
	private final long id;
	
	private String startingDate;
	private String endingDate;
	private User user;
	
	public Shift(long id, String startingDate, String endingDate, User user) {
		this.id = id;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
		this.user = user;
	}
	
	
	public String getStartingDate() {
		return startingDate;
	}
	public void setStartingDate(String startingDate) {
		this.startingDate = startingDate;
	}
	public String getEndingDate() {
		return endingDate;
	}
	public void setEndingDate(String endingDate) {
		this.endingDate = endingDate;
	}
	public long getId() {
		return id;
	}

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
}
