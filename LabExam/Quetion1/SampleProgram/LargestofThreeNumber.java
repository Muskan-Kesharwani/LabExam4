import java.util.Scanner;
public class LargestofThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
System.out.println("Enter one number");
int a = sc.nextInt();
System.out.println("Enter two number");
int b = sc.nextInt();
System.out.println("Enter third number");
int c = sc.nextInt();
if(a>b &&a>c)
{
	System.out.println("a is greater");
}
if(b>c && b>a)
{
	System.out.println("b is greater");
}
if(c>a &&c>b)
{
	System.out.println("c is greater");
}
}
}
