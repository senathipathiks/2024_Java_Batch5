package com.subash.HibernateEx5InheritanceMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table (name="Player1")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class CricketPlayer {
		@Id
		int palyerId;
		@Column(name="name")
		String palyerName;
		@Column(name="country")
		String country;
		public CricketPlayer() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CricketPlayer(int palyerId, String palyerName, String country) {
			super();
			this.palyerId = palyerId;
			this.palyerName = palyerName;
			this.country = country;
		}
		public int getPalyerId() {
			return palyerId;
		}
		public void setPalyerId(int palyerId) {
			this.palyerId = palyerId;
		}
		public String getPalyerName() {
			return palyerName;
		}
		public void setPalyerName(String palyerName) {
			this.palyerName = palyerName;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		@Override
		public String toString() {
			return "CricketPlayer [palyerId=" + palyerId + ", palyerName=" + palyerName + ", country=" + country + "]";
		}	
		
		
}
