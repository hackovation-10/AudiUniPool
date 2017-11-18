package com.team10.AudiUniPool;

import java.util.List;

public class Auto {

	private final long id;
	private final String name;
	private final String plate;
	private Boolean availability;
	private List<Shift> shift;

	public Auto(long id, String name, String drivingLicence, Boolean availability) {
		this.id = id;
		this.name = name;
		this.plate = drivingLicence;
		this.availability =availability;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPlate() {
		return plate;
	}

	public Boolean getAvailability() {
		return availability;
	}

	public List<Shift> getShift() {
		return shift;
	}

	public void setShift(List<Shift> shift) {
		this.shift = shift;
	}

	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}
	

}