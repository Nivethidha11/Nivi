package Polymorphism1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		int piece;
		float hair,a2,a3;
		String msg;
		int a1;
		Scanner s=new Scanner(System.in);
		piece=s.nextInt();
		hair=s.nextFloat();
		s.nextLine();
		msg=s.nextLine();
		//s.next();
		//System.out.println(msg);
		
		Machine m=new Machine();
		
		a1=m.produceShoePolish(piece);
		System.out.println(a1);
		
		a2=m.produceShoePolish(hair);
		System.out.println((int)a2);
		
		a3=m.produceShoePolish(msg);
		System.out.println((int)a3);
	}

}
