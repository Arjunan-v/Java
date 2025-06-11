import java.util.Scanner;
class as4
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		int i = 0;
		System.out.print("Enter n:");
		int n = sc.nextInt();
		while (n>0)
		{
			i = n%10;
			System.out.print(i);
			n = n/10;
		}
	}
}
/*
Output:
D:\QSPIDER\JAVA\26.05.25 - Class 22\Assignment>javac as4.java

D:\QSPIDER\JAVA\26.05.25 - Class 22\Assignment>java as4
Enter n:1234
4321
D:\QSPIDER\JAVA\26.05.25 - Class 22\Assignment>
*/