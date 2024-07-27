package testing.juniteg2;

public class App 
{
	static int sum(int n)
	{
		int sum = 0;
		while(n != 0)
		{
			sum = sum + (n%10);
			n = n/10;
		}
		return sum;
	}
    public static void main( String[] args )
    {
    }
}
