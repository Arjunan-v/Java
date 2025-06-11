import java.util.Scanner;
class as2
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter n:");
		int n = sc.nextInt();
		while (n!=0)
		{
			System.out.println(n);
			--n;
		}

	}
}
/*
Output:
D:\QSPIDER\JAVA\26.05.25 - Class 22\Assignment>javac as2.java

D:\QSPIDER\JAVA\26.05.25 - Class 22\Assignment>java as2
Enter n:5
5
4
3
2
1

D:\QSPIDER\JAVA\26.05.25 - Class 22\Assignment>

*/