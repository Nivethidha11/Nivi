package class8;

import java.util.Scanner;

public class LapManager extends Lap
{
	LapManager(byte no,byte thr,String player,float time)
	{
		super(no,thr,player,time);
	}
	Scanner s=new Scanner(System.in);
	
	public void display()
	{
		System.out.println("LAP MANAGER\n1. Lap Details\n2. Fastest in Lap\n3. Maximum Throws\n4. Exit\nEnter choice:\n");
		int ch=s.nextInt();
		switch(ch)
		{
			case 1: System.out.println("LAP THROWS FASTEST PLAYER TIME");
				
				
			System.out.print("Lap: "+no+"\n"+"Throws: "+thr+"\n"+"Fastest Player: "+player+"\n"+"Fastest Time: "+time+"s"+"\n");
				//for(int i=0;i<num;i++) {
				//}
				
				
				break;
			case 2:
				float t=0;
				if(t<time)
				{
					t=time;
				}
				System.out.println(t);
				break;
			case 3:
				break;
			case 4:
				System.out.println("Thank you!");
				break;
		}
		
	}

	

}
