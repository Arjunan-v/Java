import java.util.Scanner;
class cl5
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter number:");
		int n = sc.nextInt();
		int temp=n,count=0,sum=0;
		boolean flag=true;
		while (n>0)
		{
			int l=n%10;
			if (l%2==0)
			{
				sum=sum+l;
			}
			n=n/10;
		}
		System.out.println(sum);
	}
	
}
/*
Output:
D:\QSPIDER\JAVA\31.05.25 - Class 27\Class Practice Programs>javac cl5.java

D:\QSPIDER\JAVA\31.05.25 - Class 27\Class Practice Programs>java cl5
Enter number:102345
6

D:\QSPIDER\JAVA\31.05.25 - Class 27\Class Practice Programs>java cl5
Enter number:8036574
18

D:\QSPIDER\JAVA\31.05.25 - Class 27\Class Practice Programs>
*/