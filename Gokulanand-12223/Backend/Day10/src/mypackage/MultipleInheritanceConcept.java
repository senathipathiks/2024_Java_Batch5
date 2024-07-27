package mypackage;

interface One
{
	int a = 10;
}
interface Two
{
	int b = 20;
}
interface Three extends One, Two
{
	void addition();
}
class Addition implements Three
{
	public void addition()
	{
		System.out.print(a+b);
	}
}
public class MultipleInheritanceConcept
{

	public static void main(String[] args)
	{
		Addition add = new Addition();
		add.addition();
	}
}
