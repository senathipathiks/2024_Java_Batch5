package com.subash.HibernateEx5InheritanceMapping;

import javax.persistence.Entity;

@Entity
public class Batsman extends CricketPlayer {
		int runs;

		public Batsman() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Batsman(int palyerId, String palyerName, String country) {
			super(palyerId, palyerName, country);
			// TODO Auto-generated constructor stub
		}

		public Batsman(int palyerId, String palyerName, String country, int runs) {
			super(palyerId, palyerName, country);
			this.runs = runs;
		}

		public int getRuns() {
			return runs;
		}

		public void setRuns(int runs) {
			this.runs = runs;
		}
		
		
}
