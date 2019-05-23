package com.ninetailsoftware.model.facts;

import java.util.Date;

public class SimpleSwitch implements Device{
	private String status;
	private Date updatedDateTime;
	private String floor;
	private String room;
	private String id;
	private String source;
	private Boolean disableWhenAway;
	private Boolean initialLoad;
	private Boolean sendUpdate;
	
	public SimpleSwitch() {
		this.status = "0";
		this.sendUpdate = false;
	}
	
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
	public Boolean isDisableWhenAway() {
		return disableWhenAway;
	}
	public void setDisableWhenAway(Boolean disableWhenAway) {
		this.disableWhenAway = disableWhenAway;
	}
	public Boolean isInitialLoad() {
		return initialLoad;
	}

	public void setInitialLoad(Boolean initialLoad) {
		this.initialLoad = initialLoad;		
	}

	public Boolean isSendUpdate() {
		return sendUpdate;
	}

	public void setSendUpdate(Boolean sendUpdate) {
		this.sendUpdate = sendUpdate;
	}

}
