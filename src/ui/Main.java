package ui;
import model.ControlShift;
import model.Shift;
import model.User;

import java.util.Scanner;

public class Main {
	
	public static ControlShift myShifter ;
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String id;
		String name;
		String lastName;
		String tel;
		String direction;
		String typeId;
		char character='A';
		int num=1;


		int option;
		int option2;
		do {
			System.out.println("Menu");
			System.out.println("1.Add user ");
			System.out.println("2.Register shift ");
			System.out.println("3.Attend shift");
			System.out.println("4.Exit the program");
			System.out.print("Please choose an option: ");
			
			option = Integer.parseInt(sc.nextLine());
			
			switch(option) {
			case 1:
				System.out.println("write your identification, id");
				id = sc.nextLine();
				System.out.println("write your name");
				name = sc.nextLine();
				System.out.println("write your last name");
				lastName = sc.nextLine();
				System.out.println("write your tel");
				tel = sc.nextLine();
				System.out.println("write your direction");
				direction = sc.nextLine();
				System.out.println("write your type idemtification");
				typeId = sc.nextLine();
				System.out.println(myShifter.addUser(id, name,  lastName, tel,  direction, typeId));
			break;
			
			case 2:
				num =0;
				character='A';
				myShifter = new ControlShift(character, num);
				
				do {
					System.out.println("1.Attend shift");
					System.out.println("2.Nex shift");
					option2 = Integer.parseInt(sc.nextLine());
					switch(option2)	{
					
					case 1:
						
					break;
					
					case 2:
						
					break;	
					}
				}while(option2!=2);
			break;
			
			case 3:
				
			break;
			
			case 4:
				System.out.print("Thank you. Bye!");
			break;
			
			}
		}while(option!=4);
		sc.close();
	}
}
