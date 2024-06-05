package com.subash.HibernateEx5InheritanceMapping;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Batsman")
//@AttributeOverrides({
//	@AttributeOverride(name = "pid",column = @Column(name="palyerId")),
//	@AttributeOverride(name = "pname",column = @Column(name="palyerName")),
//	@AttributeOverride(name = "pcountry",column = @Column(name="country"))
//})
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
