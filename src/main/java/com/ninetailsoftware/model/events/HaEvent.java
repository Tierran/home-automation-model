package com.ninetailsoftware.model.events;

public class HaEvent {
	private String source;
	private String floor;
	private String room;
	private String deviceId;
	private String value;
	private Boolean sendUpdate;
	
	public HaEvent() {
		sendUpdate = new Boolean(false);
	}
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Boolean isSendUpdate() {
		return sendUpdate;
	}
	public void setSendUpdate(Boolean sendUpdate) {
		this.sendUpdate = sendUpdate;
	}
}
