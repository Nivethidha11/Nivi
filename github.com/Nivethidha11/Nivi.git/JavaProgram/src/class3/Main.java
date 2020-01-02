package class3;
import java.util.*;
public class Main 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		byte matches,wins,loss;
		float al,ml,at,mt;
		matches=sc.nextByte();
		wins=sc.nextByte();
		loss=sc.nextByte();
		al=sc.nextFloat();
		ml=sc.nextFloat();
		at=sc.nextFloat();
		mt=sc.nextFloat();
		PlayerRecord pl=new PlayerRecord(matches,wins,loss,al,ml,at,mt);
		pl.display();
	}

}
