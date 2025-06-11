import java.util.Scanner;
class cl1
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter number:");
		int n = sc.nextInt();
		int temp=n,x=1,ans=0,l;
		while (n>0)
		{
			l = n%10;
			l = l*x;
			ans = ans+l;
			x = x*2;
			n = n/10;
		}
		System.out.println("Decimal value of "+temp+" = "+ans);
	}	
}
/*
Output:
D:\QSPIDER\JAVA\31.05.25 - Class 27\Class Practice Programs>javac cl1.java

D:\QSPIDER\JAVA\31.05.25 - Class 27\Class Practice Programs>java cl1
Enter number:1101
Decimal value of 1101 = 13

D:\QSPIDER\JAVA\31.05.25 - Class 27\Class Practice Programs>
*/