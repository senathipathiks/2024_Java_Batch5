package com.srienath.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="meetroom")
public class MeetingRoom {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bookingID")
	private int bookingID;
	@Column(name="roomNo")
	private int roomNo;
	@Column(name="teamName")
	private String teamName;
	@Column(name="startTime")
	private String startTime;
	@Column(name="endTime")
	private String endTime;
	public int getBookingID() {
		return bookingID;
	}
	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public MeetingRoom(int bookingID, int roomNo, String teamName, String startTime, String endTime) {
		super();
		this.bookingID = bookingID;
		this.roomNo = roomNo;
		this.teamName = teamName;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public MeetingRoom() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MeetingRoom [bookingID=" + bookingID + ", roomNo=" + roomNo + ", teamName=" + teamName + ", startTime="
				+ startTime + ", endTime=" + endTime + "]";
	}
	public MeetingRoom orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
}
