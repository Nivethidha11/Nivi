package Interface3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float cash;
		int energy;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter cash");
		cash=s.nextFloat();
		System.out.println("Enter energy");
		energy=s.nextInt();
		int ch;
		do
		{
		System.out.println("1. Display\n2. Buy\n3. Socialize\n4. Work\n5. Maintainence\n6. PaintandSell\n7. Rest\n8. Exit\nEnter your choice");
		ch=s.nextInt();
		KutchiController kc=new KutchiController(cash,energy);
		if(ch==1)
		{
			kc.display();
		}
		else if(ch==2)
		{
			kc.buy();
		}
		else if(ch==3)
		{
			kc.socialize();
		}
		else if(ch==4)
		{
			kc.work();
		}
		else if(ch==5)
		{
			kc.maintainence();
		}
		else if(ch==6)
		{
			kc.paintandsell();
		}
		else if(ch==7)
		{
			kc.restfor();
		}
		}while(ch>0 && ch<8);
	}

}
