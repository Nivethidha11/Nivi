package Abstraction2;

public class Gas extends Door
{
	String gas;
	Gas(String name,String gas)
	{
		super(name);
		this.gas=gas;
	}
	public void unlock()
	{
		int i;
		String reverse="";
		for(i=gas.length()-1;i>=0;i--)
		{
			reverse=reverse+gas.charAt(i);
		}
		//System.out.println(reverse);
		if(reverse.equals(gas))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}