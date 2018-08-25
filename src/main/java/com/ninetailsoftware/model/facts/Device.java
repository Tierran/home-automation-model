package com.ninetailsoftware.model.facts;

public interface Device {

	public String getStatus();
	public void setStatus(String status);
	public String getId();
	public void setId(String id);
	public String getFloor();
	public void setFloor(String floor);
	public String getRoom();
	public void setRoom(String room);
	public String getSource();
	public void setSource(String source);
	public Boolean isDisableWhenAway();
	public void setDisableWhenAway(Boolean disableWhenAway);
}
