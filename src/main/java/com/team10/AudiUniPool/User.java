package com.team10.AudiUniPool;
public class User {

    private final long id;
    private final String name;
    private String drivingLicenceType;

    public User(long id, String name, String drivingLicenceType) {
        this.id = id;
        this.name = name;
        this.drivingLicenceType = drivingLicenceType;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return name;
    }

	public String getDrivingLicenceType() {
		return drivingLicenceType;
	}

	public void setDrivingLicenceType(String drivingLicenceType) {
		this.drivingLicenceType = drivingLicenceType;
	}

	public String getName() {
		return name;
	}
    
    
}