package Abstraction2;

public class Star extends Door
{
	int star;
	Star(String name,int star)
	{
		super(name);
		this.star=star;
	}
	public void unlock()
	{
		int i,j;
		for (i = star; i >= 1; i--)
        {
            for (j = i; j >= 1; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = 2; i <= star; i++)
        {
            for (j = i; j >= 1; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
		
	}
}
