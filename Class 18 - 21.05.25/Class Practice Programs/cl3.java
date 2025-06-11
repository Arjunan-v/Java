import java.util.Scanner;
class cl3
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Starts");
		System.out.print("Enter Number");
		int num = sc.nextInt();
		if (num%3==0 || num%5==0)
		{
			if(num%3==0 && num%5==0)
			{
				System.out.println("FizzBuzz");
			}
			else
			{
				if (num%3==0)
				{
					System.out.println("Fizz");
				}
				else
				{
					System.out.println("Buzz");
				}
			}
		}
		System.out.println("Ends");
	}
}
/*
Output:
D:\QSPIDER\JAVA\21.05.25 - Class 18\Class Practice Programs>javac cl3.java

D:\QSPIDER\JAVA\21.05.25 - Class 18\Class Practice Programs>java cl3
Starts
Enter Number3
Fizz
Ends

D:\QSPIDER\JAVA\21.05.25 - Class 18\Class Practice Programs>java cl3
Starts
Enter Number5
Buzz
Ends

D:\QSPIDER\JAVA\21.05.25 - Class 18\Class Practice Programs>java cl3
Starts
Enter Number15
FizzBuzz
Ends

D:\QSPIDER\JAVA\21.05.25 - Class 18\Class Practice Programs>
*/