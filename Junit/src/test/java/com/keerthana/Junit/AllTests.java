package com.keerthana.Junit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AppTest.class, AppTestSum.class })
public class AllTests {

}
