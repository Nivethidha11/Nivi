package class6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner q= new Scanner(System.in);
		System.out.print("Enter player name:");
		String name=q.next();
		System.out.print("Enter player position:");
		int pos=q.nextInt();
		Player p=new Player(name,pos);
		p.view();
	
	}

}
