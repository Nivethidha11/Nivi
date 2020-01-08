package class4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner q=new Scanner(System.in);
		String name=q.next();
		String city=q.next();
		Team t=new Team(name,city);
		t.display();
	}

}
