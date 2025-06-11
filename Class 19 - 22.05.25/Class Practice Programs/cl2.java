import java.util.Scanner;
class cl2
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Number:");
		int num = sc.nextInt();
		if (num % 3 == 0 && num%5==0)
		{
			System.out.println("FizzBuzz");
		}
		else if (num%3 == 0)
		{
			System.out.println("Fizz");
		}
		else if (num%5 == 0)
		{
			System.out.println("Buzz");
		}
		else
			System.out.println("Invalid");
	}
}
/*
Output:
D:\QSPIDER\JAVA\22.05.25 - Class 19\Class Practice Programs>java cl2
Enter Number:5
Buzz

D:\QSPIDER\JAVA\22.05.25 - Class 19\Class Practice Programs>java cl2
Enter Number:3
Fizz

D:\QSPIDER\JAVA\22.05.25 - Class 19\Class Practice Programs>java cl2
Enter Number:15
FizzBuzz

D:\QSPIDER\JAVA\22.05.25 - Class 19\Class Practice Programs>
*/