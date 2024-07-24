package com.velan.restapp.serviceimp;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AttendanceServiceImpTest.class, StudentServiceImpTest.class })
public class AllTests {

}
