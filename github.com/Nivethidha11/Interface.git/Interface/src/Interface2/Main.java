package Interface2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("1. ArtExpo\n2. Museum\n3. BlackMarket");
		int ch=s.nextInt();
		float res,result;
		if(ch==1)
		{
			Art a=new Art();
			System.out.println("1. Buy\n2. Sell");
			int choice=s.nextInt();
			
			if(choice==1)
			{
				result=a.buy();
				System.out.println("Buy the product for Rs. "+result);
			}
			else
			{
				Painting p=new Painting();
				p.type=s.next();
				res=a.sell(p);
				System.out.println("Sell the product for Rs. "+res);
			}
		}
		
		else if(ch==2)
		{
			Museum m=new Museum();
			System.out.println("1. Buy\n2. Sell");
			int choice=s.nextInt();
			
			if(choice==1)
			{
				result=m.buy();
				System.out.println("Buy the product for Rs. "+result);
			}
			else
			{
				Painting p=new Painting();
				p.type=s.next();
				res=m.sell(p);
				System.out.println("Sell the product for Rs. "+res);
			}
		}
		
		else
		{
			BlackMarket bm=new BlackMarket();
			System.out.println("1. Buy\n2. Sell");
			int choice=s.nextInt();
			
			if(choice==1)
			{
				result=bm.buy();
				System.out.println("Buy the product for Rs. "+result);
			}
			else
			{
				Painting p=new Painting();
				p.type=s.next();
				res=bm.sell(p);
				System.out.println("Sell the product for Rs. "+res);
			}
		}
	}

}
