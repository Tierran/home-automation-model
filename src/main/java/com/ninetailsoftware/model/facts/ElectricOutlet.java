package com.ninetailsoftware.model.facts;

import java.util.Date;

public class ElectricOutlet implements Device {

	private String status;
	private Date updatedDateTime;
	private String floor;
	private String room;
	private String id;
	private String source;
	private String offWhenAway;
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getUpdatedDateTime() {
		return updatedDateTime;
	}
	public void setUpdatedDateTime(Date updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getOffWhenAway() {
		return offWhenAway;
	}
	public void setOffWhenAway(String offWhenAway) {
		this.offWhenAway = offWhenAway;
	}
	@Override
	public Boolean isDisableWhenAway() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setDisableWhenAway(Boolean disableWhenAway) {
		// TODO Auto-generated method stub
		
	}
}
