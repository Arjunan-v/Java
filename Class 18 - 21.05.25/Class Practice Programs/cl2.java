import java.util.Scanner;
class cl2 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Starts");
		System.out.print("Enter Number");
		int num = sc.nextInt();
		if (num>0)
		{
			if(num==0)
			{
				System.out.println(num +" is Zero");
			}
			else
			{
				System.out.println(num +" is Positive");
			}
		}
		else
		{
			if (num==0)
			{
				System.out.println(num +" is Zero");
			}
			else
			{
				System.out.println(num +" is Negative");
			}
		}
		System.out.println("Ends");
	}
}
/*
Output:
D:\QSPIDER\JAVA\21.05.25 - Class 18\Class Practice Programs>javac cl2.java

D:\QSPIDER\JAVA\21.05.25 - Class 18\Class Practice Programs>java cl2
Starts
Enter Number0
0 is Zero
Ends

D:\QSPIDER\JAVA\21.05.25 - Class 18\Class Practice Programs>java cl2
Starts
Enter Number4
4 is Positive
Ends

D:\QSPIDER\JAVA\21.05.25 - Class 18\Class Practice Programs>java cl2
Starts
Enter Number-3
-3 is Negative
Ends

D:\QSPIDER\JAVA\21.05.25 - Class 18\Class Practice Programs>
*/