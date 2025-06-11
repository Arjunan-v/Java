import java.util.Scanner;
class as9
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the month number:");
		int a = sc.nextInt();
		switch(a)
		{
			case 12,1,2:
			{
				System.out.println("Winter");
				break;
			}
			case 3,4,5:
			{
				System.out.println("Summer");
				break;
			}
			case 6,7,8,9:
			{
				System.out.println("Monsoon");
				break;
			}
			case 10,11:
			{
				System.out.println("Post-Monsoon");
				break;
			}
			default:
				System.out.println("Invalid choice");
		}
	}
}
/*
Output:
D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>javac as9.java

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as9
Enter the month number:1
Winter

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as9
Enter the month number:4
Summer

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as9
Enter the month number:8
Monsoon

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as9
Enter the month number:10
Post-Monsoon

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>

*/