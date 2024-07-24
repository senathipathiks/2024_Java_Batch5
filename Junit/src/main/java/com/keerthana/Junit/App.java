package com.keerthana.Junit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static boolean  CompareString (String str1,String str2) {
    	 if(str1.equals(str2))
    		 return  true;
    	 else
    		 return false;
    }
    
    public static int sum(int[] val) {
    	
    	int total=0;
    	for (int i=0;i<val.length;i++)
    		total+=val[i];
    	
    	return total;
    }
    
}
