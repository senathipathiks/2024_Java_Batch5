package com.junitex.ex1;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AdditionTest.class, AgeVerifierTest.class })
public class AllTests {

}
