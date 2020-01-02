//import java.util.*;
package class1;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		String t,c;
		Scanner sc=new Scanner(System.in);
		t=sc.next();
		c=sc.next();
		Team te=new Team(t,c);
		te.display();
	}

}
