import java.util.Scanner;
class cl5
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
			if (i%3 == 0 && i%5==0)
			{
				System.out.println(i+": FizzBuzz");
			}
			else if (i%3 == 0)
			{
				System.out.println(i+": Fizz");
			}
			else if (i%5 == 0)
			{
				System.out.println(i+": Buzz");
			}
			
		}
	}
}
/*
Output:

WAJP To read start and end and print Fizz if the number is divisible by 3, print Buzz if the number is divisible by 5 and print FizzBuzz if the number is divisible by 3 and 5.

D:\QSPIDER\JAVA\28.05.25 - Class 24\Class Practice Programs>javac cl5.java

D:\QSPIDER\JAVA\28.05.25 - Class 24\Class Practice Programs>java cl5
Enter starting range:10
Enter ending range:20
Buzz
Fizz
FizzBuzz
Fizz
Buzz

D:\QSPIDER\JAVA\28.05.25 - Class 24\Class Practice Programs>
*/