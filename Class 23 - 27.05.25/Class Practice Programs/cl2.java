import java.util.Scanner;
class cl2
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		boolean flag = true;
		do
		{
			System.out.println("Select Hotel:");
			System.out.println("1.Buhari\n2.A2B\n3.Exit");
			int c = sc.nextInt();
			switch (c)
			{
			case 1:
				{
					System.out.println("Welcome to Buhari!");
					break;
				}
				case 2:
				{
					System.out.println("Welcome to A2B!");
					break;
				}
				case 3:
				{
					flag = false;
					break;
				}
				default:
				{
					System.out.println("Invalid Choice");
					break;
				}
			
			}
		}
		while (flag);
		System.out.println("Thanks!");
	}
}
/*
Output:
D:\QSPIDER\JAVA\27.05.25 - Class 23\Class Practice Programs>javac cl2.java

D:\QSPIDER\JAVA\27.05.25 - Class 23\Class Practice Programs>java cl2
Select Hotel:
1.Buhari
2.A2B
3.Exit
1
Welcome to Buhari!
Select Hotel:
1.Buhari
2.A2B
3.Exit
2
Welcome to A2B!
Select Hotel:
1.Buhari
2.A2B
3.Exit
3
Thanks!

D:\QSPIDER\JAVA\27.05.25 - Class 23\Class Practice Programs>
*/