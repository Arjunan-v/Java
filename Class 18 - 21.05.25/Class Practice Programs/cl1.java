import java.util.Scanner;
class cl1 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Starts");
		System.out.print("Enter Number");
		int num = sc.nextInt();
		if (num%2==0)
		{
			System.out.println(num +" is Even");
		}
		else
		{
			System.out.println(num +" is Odd");
		}
		System.out.println("Ends");
	}
}
/*
Output:
D:\QSPIDER\JAVA\21.05.25 - Class 18\Class Practice Programs>javac cl1.java

D:\QSPIDER\JAVA\21.05.25 - Class 18\Class Practice Programs>java cl1
Starts
Enter Number4
4 is Even
Ends

D:\QSPIDER\JAVA\21.05.25 - Class 18\Class Practice Programs>java cl1
Starts
Enter Number3
3 is Odd
Ends

D:\QSPIDER\JAVA\21.05.25 - Class 18\Class Practice Programs>
*/