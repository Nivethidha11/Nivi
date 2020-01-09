package Polymorphism3;

public class Machine 
{
	int sugar,res;
	Machine(int sugar)
	{
		this.sugar=sugar;
	}
	void pushBigRedButton()
	{
		res=(sugar*50)/100;
		System.out.println("Sugar candies "+res);
	}
}
