import java.util.Scanner;
class cl2
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		int i = 0;
		int sum =0;
		System.out.print("Enter n:");
		int n = sc.nextInt();
		while (n>0)
		{
			i = n%10;
			sum = sum+i;
			n = n/10;
		}
		System.out.println("Sum is :"+sum);
	}
}
/*
Output:
D:\QSPIDER\JAVA\26.05.25 - Class 22\Class Practice Programs>javac cl2.java

D:\QSPIDER\JAVA\26.05.25 - Class 22\Class Practice Programs>java cl2
Enter n:1234
Sum is :10

D:\QSPIDER\JAVA\26.05.25 - Class 22\Class Practice Programs>
*/