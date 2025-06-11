import java.util.Scanner;
class cl1 
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		int i = 1;
		System.out.print("Enter n:");
		int n = sc.nextInt();
		while (i<=n)
		{
			if (i%2 == 0)
			{
				System.out.println(i);
			}
			++i;
		}
	}
}
/*
Output:
D:\QSPIDER\JAVA\26.05.25 - Class 22\Class Practice Programs>java cl1
Enter n:10
2
4
6
8
10

D:\QSPIDER\JAVA\26.05.25 - Class 22\Class Practice Programs>
*/