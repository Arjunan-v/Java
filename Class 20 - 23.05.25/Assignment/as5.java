import java.util.Scanner;
class as5
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the signal colour\nChoices:\nR - Red\nY - Yellow\nG - Green");
		char c = sc.next().charAt(0);
		switch(c)
		{
			case 'R':
			{
				System.out.println("Stop");
				break;
			}
			case 'Y':
			{
				System.out.println("Caution");
				break;
			}
			case 'G':
			{
				System.out.println("Go");
				break;
			}
			default:
				System.out.println("Invalid choice");
		}
	}
}
/*
Output:
D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>javac as5.java

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as5
Enter the signal colour
Choices:
R - Red
Y - Yellow
G - Green
R
Stop

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as5
Enter the signal colour
Choices:
R - Red
Y - Yellow
G - Green
Y
Caution

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as5
Enter the signal colour
Choices:
R - Red
Y - Yellow
G - Green
G
Go

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>
*/