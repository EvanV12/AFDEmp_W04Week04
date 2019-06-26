package p01Pets;

import java.util.Scanner;

public class MainPet {

	public MainPet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		J01Pet pet;
		int animal;
		
		Scanner input = new Scanner(System.in);
		
		do {
		System.out.println("Pick an animal.\nEnter 1 for dog, or 2 for cat.\nEnter 0 to exit.");
		animal = input.nextInt();
		
		
		
	//	Pet p;
		if (animal==1) {
			pet = new J02Dog();
			pet.getSound();
			}
		else if (animal==2) {
			pet = new J03Cat();
			pet.getSound();
			}
		else if (animal == 0) {
			System.out.println("Program terminated.");
		}
		else {
			System.out.println("Try again");
		}
		} while (animal != 0);
		
		
		input.close();
		
		//else {
		//	System.out.println("Try again");
	//}
			
	//		p.getSound();
	//	System.out.println(p.getSound());
		
	
	}

}
