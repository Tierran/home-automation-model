package com.ninetailsoftware.model.facts;

import java.util.Date;
import java.util.List;

public class Room {
	private String status;
	private Date updatedDateTime;
	private String floor;
	private String room;
	private String id;
	private List<String> adjacentRooms;
	
	public List<String> getAdjacentRooms() {
		return adjacentRooms;
	}
	public void setAdjacentRooms(List<String> adjacentRooms) {
		this.adjacentRooms = adjacentRooms;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getUpdatedDateTime() {
		return updatedDateTime;
	}
	public void setUpdatedDateTime(Date updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
