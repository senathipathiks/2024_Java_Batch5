package com.velan.Testsample;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AppTest.class,AppTest1.class })
public class AllTests {

}
