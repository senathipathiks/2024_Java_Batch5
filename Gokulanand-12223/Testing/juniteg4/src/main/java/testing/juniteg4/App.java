package testing.juniteg4;

public class App 
{
	static boolean compare(int n)
	{
		int num = (n%10);
		n = n/10;
		while(n != 0)
		{
			int a = n%10;
			if(a>num)
			{
				return false;
			}
			num = a;
			n = n/10;	
		}
		return true;
	}
    public static void main( String[] args )
    {
        
    }
}
