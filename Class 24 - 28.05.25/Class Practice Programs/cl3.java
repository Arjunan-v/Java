import java.util.Scanner;
class cl3
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter n:");
		int n = sc.nextInt();
		for (int i=n;i>0 ;i-- )
		{
			System.out.println(i);
		}
	}
}
/*
Output:
D:\QSPIDER\JAVA\28.05.25 - Class 24\Class Practice Programs>javac cl3.java

D:\QSPIDER\JAVA\28.05.25 - Class 24\Class Practice Programs>java cl3
Enter n:5
5
4
3
2
1

D:\QSPIDER\JAVA\28.05.25 - Class 24\Class Practice Programs>
*/