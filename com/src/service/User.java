package service;

import java.util.Scanner;

public class User {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	boolean exit=true;
	while(exit)
	{
	System.out.println("1. for Read all data");
	System.out.println("2. Update data");
	System.out.println("3. Delete data");
	System.out.println("4. Insert data");
	System.out.println("0. Exit");
	int input=sc.nextInt();
	switch(input)
	{
		case 1 : new Service().readAll();
				break;
		case 2 : new Service().updateData();
				break;
		case 3 : new Service().deleteData();
				break;
		case 4 : new Service().insertData();
				break;
		case 0: exit=false;
			    break;
	    default: System.out.println("Invalid input");
	}
	}
}
}
