import java.util.Scanner;
class cl4
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter starting range:");
		int s = sc.nextInt();
		System.out.print("Enter ending range:");
		int e = sc.nextInt();
		for (int i=s;i<=e ;i++ )
		{
			if (i%2 == 0)
			{
				System.out.println(i);
			}
			
		}
	}
}
/*
Output:
D:\QSPIDER\JAVA\28.05.25 - Class 24\Class Practice Programs>javac cl4.java

D:\QSPIDER\JAVA\28.05.25 - Class 24\Class Practice Programs>java cl4
Enter starting range:10
Enter ending range:20
10
12
14
16
18
20

D:\QSPIDER\JAVA\28.05.25 - Class 24\Class Practice Programs>
*/