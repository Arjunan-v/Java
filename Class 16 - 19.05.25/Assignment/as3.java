import java.util.Scanner;
class as3
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{

		System.out.print("Enter Year: ");
		int year = sc.nextInt();

		System.out.println("Year is "+year);

		String res = (year % 4 == 0) ? "It is a leap year" : "It is not a leap year";
		System.out.println("Result : "+res);
	}
}
/*
Output:
D:\QSPIDER\JAVA\18.05.25 - Class 16\Assignment>javac as3.java

D:\QSPIDER\JAVA\18.05.25 - Class 16\Assignment>java as3
Enter Year: 2012
Year is 2012
Result : It is a leap year

D:\QSPIDER\JAVA\18.05.25 - Class 16\Assignment>java as3
Enter Year: 2025
Year is 2025
Result : It is not a leap year

D:\QSPIDER\JAVA\18.05.25 - Class 16\Assignment>
*/