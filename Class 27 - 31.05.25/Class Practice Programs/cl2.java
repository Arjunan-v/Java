import java.util.Scanner;
class cl2
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter number:");
		int n = sc.nextInt();
		int temp=n,q;
		String ans ="";
		while (n>0)
		{
			q=n%2;
			ans = q+ans;
			n=n/2;
		}
		System.out.println("Binary value of "+temp+" = "+ans);
	}	
}
/*
Output:
D:\QSPIDER\JAVA\31.05.25 - Class 27\Class Practice Programs>javac cl2.java

D:\QSPIDER\JAVA\31.05.25 - Class 27\Class Practice Programs>java cl2
Enter number:13
Binary value of 13 = 1101

D:\QSPIDER\JAVA\31.05.25 - Class 27\Class Practice Programs>
*/