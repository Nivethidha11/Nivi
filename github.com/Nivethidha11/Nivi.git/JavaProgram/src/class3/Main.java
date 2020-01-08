package class3;
import java.util.*;
public class Main 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		byte matches,wins,loss;
		float al,ml,at,mt;
		int min,max;
		matches=sc.nextByte();
		wins=sc.nextByte();
		loss=sc.nextByte();
		al=sc.nextFloat();
		ml=sc.nextFloat();
		at=sc.nextFloat();
		mt=sc.nextFloat();
		min = Math.min(wins,loss);
		max = Math.max(wins,loss);
	    for (int i = 2; i <= min; i++) 
	    {
	        while(max % i == 0 && min % i == 0) 
	        {
	            max /= i;
	            min /= i;
	        }
	    }
		PlayerRecord pl=new PlayerRecord(matches,max,min,al,ml,at,mt);
		pl.display();
	}
}