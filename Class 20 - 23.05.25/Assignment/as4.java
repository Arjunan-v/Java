import java.util.Scanner;
class as4
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Grade");
		char c = sc.next().charAt(0);
		switch(c)
		{
			case 'A':
			{
				System.out.println("4.0");
				break;
			}
			case 'B':
			{
				System.out.println("3.0");
				break;
			}
			case 'C':
			{
				System.out.println("2.0");
				break;
			}
			case 'D':
			{
				System.out.println("1.0");
				break;
			}
			case 'F':
			{
				System.out.println("Fail");
				break;
			}
			default:
				System.out.println("Invalid choice");
		}
	}
}
/*
Output:
D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>javac as4.java

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as4
Enter the Grade
A
4.0

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as4
Enter the Grade
B
3.0

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as4
Enter the Grade
C
2.0

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as4
Enter the Grade
D
1.0

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as4
Enter the Grade
F
Fail

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as4
Enter the Grade
G
Invalid choice

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>
*/