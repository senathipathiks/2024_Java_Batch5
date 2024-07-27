package Spring.eg3;

public class BeanLifeCycle 
{
	public BeanLifeCycle() 
	{
		System.out.println("Constructor method");
	}
	
	public void init()
	{
		System.out.println("Instantiation method");
	}
	
	public void destroy()
	{
		System.out.println("Destroy method");
	}
}
