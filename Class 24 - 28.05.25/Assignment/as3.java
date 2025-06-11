import java.util.Scanner;
class as3
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter number:");
		int n = sc.nextInt();
		for (int i=1;i<=n/2;i++)
		{
			if (n%i == 0)
			{
				System.out.println(i);
			}
		}
	}
}
/*
Output:
D:\QSPIDER\JAVA\28.05.25 - Class 24\Assignment>javac as3.java

D:\QSPIDER\JAVA\28.05.25 - Class 24\Assignment>java as3
Enter number:10
1
2
5
10

D:\QSPIDER\JAVA\28.05.25 - Class 24\Assignment>
*/