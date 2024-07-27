package testing.juniteg3;

public class App 
{
	static int max(int n)
	{
		int max = -1;
		while(n != 0)
		{
			int a = n%10;
			if(max < a) {
				max = a;
			}
			n = n/10;
		}
		return max;
	}
    
}
