package com.gana.task2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Subject {
	
	@Value("7284")
	int subjectid;
	@Value("civil")
	String subjectname;
	@Value("Spec of civil engineering")
	String subjectdesc;

	
	public String toString() {
		return "Spec [subjectid = "+ subjectid +", subjectname = "+ subjectname +" , subjectdesc = "+ subjectdesc +"]";
		
	}


	public void setSubjectid(int i) {
		// TODO Auto-generated method stub
		
	}

}
