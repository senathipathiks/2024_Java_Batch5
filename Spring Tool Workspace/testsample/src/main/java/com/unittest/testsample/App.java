package com.unittest.testsample;

public class App 
{
    public static boolean CompareString(String s1, String s2) {
    	if(s1.equals(s2)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public static int sum(int val[]) {
    	int tot = 0;
    	for(int i=0 ; i<=val.length ; i++) {
    		tot += i;
    	}
    	return tot;
    }
}