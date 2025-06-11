import java.util.Scanner;
class as1
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{

		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		System.out.println("Number : "+num);
		
		String res = (num%2==0) ? "Even Number" : "Odd Number";
		System.out.println("Result : "+res);



	}
}
/*
Output:
D:\QSPIDER\JAVA\18.05.25 - Class 16\Assignment>javac as1.java

D:\QSPIDER\JAVA\18.05.25 - Class 16\Assignment>java as1
Enter Number: 2
Number : 2
Result : Even Number

D:\QSPIDER\JAVA\18.05.25 - Class 16\Assignment>java as1
Enter Number: 5
Number : 5
Result : Odd Number

D:\QSPIDER\JAVA\18.05.25 - Class 16\Assignment>
*/