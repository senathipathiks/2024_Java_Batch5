package com.aravind.unit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AppTest.class, AppTest2.class, AppTest3.class })

public class AllTests {

}
