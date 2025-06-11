import java.util.Scanner;
class cl1
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("1.JAVA\n2.SQL\n3.WEBTECH");
		System.out.print("Choose the subject:");
		int num = sc.nextInt();
		if (num == 1)
		{
			System.out.println("Tabrez");
		}
		else if (num == 2)
		{
			System.out.println("Nagaraj");
		}
		else if (num == 3)
		{
			System.out.println("Pranav");
		}
		else
			System.out.println("Invalid Selection");
	}
}
/*
Output:
D:\QSPIDER\JAVA\22.05.25 - Class 19\Class Practice Programs>javac cl1.java

D:\QSPIDER\JAVA\22.05.25 - Class 19\Class Practice Programs>java cl1
1.JAVA
2.SQL
3.WEBTECH
Choose the subject:1
Tabrez

D:\QSPIDER\JAVA\22.05.25 - Class 19\Class Practice Programs>java cl1
1.JAVA
2.SQL
3.WEBTECH
Choose the subject:2
Nagaraj

D:\QSPIDER\JAVA\22.05.25 - Class 19\Class Practice Programs>java cl1
1.JAVA
2.SQL
3.WEBTECH
Choose the subject:3
Pranav

D:\QSPIDER\JAVA\22.05.25 - Class 19\Class Practice Programs>java cl1
1.JAVA
2.SQL
3.WEBTECH
Choose the subject:7
Invalid Selection

D:\QSPIDER\JAVA\22.05.25 - Class 19\Class Practice Programs>
*/