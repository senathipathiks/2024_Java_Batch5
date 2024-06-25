package com.srienath.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="campaignRestReact")
public class Campaign {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="campaignName")
	private String campaignName;
	@Column(name="venueLocation")
	private String venueLocation;
	@Column(name="partyName")
	private String partyName;
	@Column(name="candidateName")
	private String candidateName;
	@Column(name="startTime")
	private String startTime;
	@Column(name="endTime")
	private String endTime;
	@Column(name="email")
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getVenueLocation() {
		return venueLocation;
	}
	public void setVenueLocation(String venuLocation) {
		this.venueLocation = venuLocation;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Campaign(int id, String campaignName, String venueLocation, String partyName, String candidateName,
			String startTime, String endTime, String email) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.venueLocation = venueLocation;
		this.partyName = partyName;
		this.candidateName = candidateName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.email = email;
	}
	public Campaign() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Campaign [id=" + id + ", campaignName=" + campaignName + ", venueLocation=" + venueLocation
				+ ", partyName=" + partyName + ", candidateName=" + candidateName + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", email=" + email + "]";
	}
	
	
	
	
}
