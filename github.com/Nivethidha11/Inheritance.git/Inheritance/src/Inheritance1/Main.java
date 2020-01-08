package Inheritance1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String species,type;
		Scanner s=new Scanner(System.in);
		species=s.next();
		type=s.next();
		boolean heat=s.nextBoolean();
		LavaDino ld=new LavaDino(species,type,heat);
		ld.display();
	}

}
