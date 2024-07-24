package com.aravind.unit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int CompareString( String str1, String str2 )
    {
        if(str1.equals(str2)) {
        	return 1;
        }
		return 0;
    }
    
    public static int sum(int[] val) {
    	int total = 0;
    	for(int i = 0; i < val.length; i++) {
    		total += val[i];
    	}
    	return total;
    }
    
    public static boolean StringCmpr( String str1, String str2 )
    {
        if(str1.equals(str2)) {
        	return true;
        }
		return false;
    }
}
