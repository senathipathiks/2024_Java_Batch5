package com.shp.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "meeting")
public class Meet {
	
		@Id
		@Column(name = "meetBookingId")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int bookingid;
		
		@Column
		private int meetUserid;
		
		@Column
		private int meetRoomid;
		
		@Column
		private String meetUserName;
		
		@Column
		private String meetStartTime;
		
		@Column
		private String meetEndTime;
		
		

		public Meet() {
			super();
			// TODO Auto-generated constructor stub
		}



		public Meet(int bookingid, int meetUserid, int meetRoomid, String meetUserName, String meetStartTime,
				String meetEndTime) {
			super();
			this.bookingid = bookingid;
			this.meetUserid = meetUserid;
			this.meetRoomid = meetRoomid;
			this.meetUserName = meetUserName;
			this.meetStartTime = meetStartTime;
			this.meetEndTime = meetEndTime;
		}



		public int getBookingid() {
			return bookingid;
		}



		public void setBookingid(int bookingid) {
			this.bookingid = bookingid;
		}



		public int getMeetUserid() {
			return meetUserid;
		}



		public void setMeetUserid(int meetUserid) {
			this.meetUserid = meetUserid;
		}



		public int getMeetRoomid() {
			return meetRoomid;
		}



		public void setMeetRoomid(int meetRoomid) {
			this.meetRoomid = meetRoomid;
		}



		public String getMeetUserName() {
			return meetUserName;
		}



		public void setMeetUserName(String meetUserName) {
			this.meetUserName = meetUserName;
		}



		public String getMeetStartTime() {
			return meetStartTime;
		}



		public void setMeetStartTime(String meetStartTime) {
			this.meetStartTime = meetStartTime;
		}



		public String getMeetEndTime() {
			return meetEndTime;
		}



		public void setMeetEndTime(String meetEndTime) {
			this.meetEndTime = meetEndTime;
		}



		@Override
		public String toString() {
			return "Meet [bookingid=" + bookingid + ", meetUserid=" + meetUserid + ", meetRoomid=" + meetRoomid
					+ ", meetUserName=" + meetUserName + ", meetStartTime=" + meetStartTime + ", meetEndTime="
					+ meetEndTime + "]";
		}


		
		
}

