package com.unittest.testsample;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AppTest.class, AppTest2.class })
public class AllTests {

}
