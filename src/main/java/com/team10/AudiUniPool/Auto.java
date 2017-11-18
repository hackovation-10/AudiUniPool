package com.team10.AudiUniPool;
public class Auto {

    private final long id;
    private final String name;
    private final String plate;

    public Auto(long id, String name, String drivingLicence) {
        this.id = id;
        this.name = name;
        this.plate = drivingLicence;
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

}