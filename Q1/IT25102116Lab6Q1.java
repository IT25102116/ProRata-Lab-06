import java.util.Scanner;

public class IT25102116Lab6Q1{

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		double number = input.nextDouble();
		
		double squre = number * number;
		double squreroot = Math.sqrt(number);
		
		System.out.println("The square of " + number + " is : " + squre);
        System.out.println("The square root of " + number + " is : " + squreroot);
	
	}

}