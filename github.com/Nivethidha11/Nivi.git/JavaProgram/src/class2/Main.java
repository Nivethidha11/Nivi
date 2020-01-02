package class2;

import java.util.Scanner;

import class1.Team;

public class Main {

	public static void main(String[] args) 
	{
		String n,p;
		Scanner sc=new Scanner(System.in);
		n=sc.next();
		p=sc.next();
		Player e=new Player(n,p);
		e.display();

	}

}
