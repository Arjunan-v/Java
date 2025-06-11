import java.util.Scanner;
class as1
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.print("Enter Percentage:");
		double a = sc.nextDouble();

		if (a>100 || a<0)
		{
			Thread.sleep(1000);
			System.out.println("Invalid");
		}
		else if (a >= 90)
		{
			Thread.sleep(1000);
			System.out.println("A Grade");
		}
		else if (a >= 60)
		{
			Thread.sleep(1000);
			System.out.println("B Grade");
		}
		else if (a >= 35)
		{
			Thread.sleep(1000);
			System.out.println("C Grade");
		}
		else
		{
			Thread.sleep(1000);
			System.out.println("Fail");
		}

	}
}
/*
Output:
D:\QSPIDER\JAVA\22.05.25 - Class 19\Assignment>javac as1.java

D:\QSPIDER\JAVA\22.05.25 - Class 19\Assignment>java as1
Enter Percentage:101
Invalid

D:\QSPIDER\JAVA\22.05.25 - Class 19\Assignment>java as1
Enter Percentage:92
A Grade

D:\QSPIDER\JAVA\22.05.25 - Class 19\Assignment>java as1
Enter Percentage:65
B Grade

D:\QSPIDER\JAVA\22.05.25 - Class 19\Assignment>java as1
Enter Percentage:40
C Grade

D:\QSPIDER\JAVA\22.05.25 - Class 19\Assignment>java as1
Enter Percentage:33
Fail

D:\QSPIDER\JAVA\22.05.25 - Class 19\Assignment>java as1
Enter Percentage:-3
Invalid

D:\QSPIDER\JAVA\22.05.25 - Class 19\Assignment>
*/