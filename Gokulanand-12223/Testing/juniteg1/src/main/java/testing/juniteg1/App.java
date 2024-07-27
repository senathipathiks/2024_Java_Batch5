package testing.juniteg1;

public class App 
{
    public static int compareString(String s1, String s2)
    {
    	if(s1.equals(s2))
    	{
    		return 1;
    	}
    	else
    	{
    		return 0;
    	}
    }
    
    
    public static int sum(int value[])
    {
		int total = 0;
		for(int i=0; i<=value.length; i++)
		{
			total+=i;
		}
		return total;
    }
}
