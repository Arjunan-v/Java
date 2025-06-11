import java.util.Scanner;
class as1 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a:");
		int a = sc.nextInt();
		System.out.print("Enter b:");
		int b = sc.nextInt();
		System.out.print("Enter c:");
		int c = sc.nextInt();
		
		if ((a>b && a<c) || (a<b && a>c))
		{
			System.out.println(a+" is the 2nd largest number");
		}
		if ((b>a && b<c) || (b<a && b>c))
		{
			System.out.println(b+" is the 2nd largest number");
		}
		if ((c>a && c<b) || (c<a && c>b))
		{
			System.out.println(c+" is the 2nd largest number");
		}
	}
}
/*
Output:
D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>javac as1.java

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as1
Enter a:10
Enter b:20
Enter c:30
20 is the 2nd largest number

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as1
Enter a:6
Enter b:5
Enter c:8
6 is the 2nd largest number

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as1
Enter a:3
Enter b:1
Enter c:2
2 is the 2nd largest number

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>
*/