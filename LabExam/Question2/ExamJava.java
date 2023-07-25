import java.util.Scanner;

public class ExamJava {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int num1= sc.nextInt();
		System.out.println("Enter number 2: ");
		int num2= sc.nextInt();
		System.out.println("Enter number 3: ");
		int num3= sc.nextInt();
		//Edited file
		int sum;

		
		
		if(num1+num2 > num1+num3)
			sum = num1+num2;
		else
			if(num1+num3 > num1+num2)
				sum = num1+num3;
		else
				sum= num1+num3;				

		System.out.println(sum);
		System.out.println("Average of numbers: " +(num1+num2+num3)/3.0);
	}
}
