import java.util.Scanner;
class as10
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("How many months are there in a year?\n1.12months\n2.11months\n3.10months\n4.None of the above");
		System.out.print("Choose your answer:");
		int a = sc.nextInt();
		switch(a)
		{
			case 1:
			{
				System.out.println("Answer is correct!");
				break;
			}
			case 2,3,4:
			{
				System.out.println("Wrong Answer!");
				break;
			}
			default:
				System.out.println("Invalid choice");
		}
	}
}
/*
Output:
D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>javac as10.java

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as10
How many months are there in a year?
1.12months
2.11months
3.10months
4.None of the above
Choose your answer:1
Answer is correct!

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as10
How many months are there in a year?
1.12months
2.11months
3.10months
4.None of the above
Choose your answer:2
Wrong Answer!

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as10
How many months are there in a year?
1.12months
2.11months
3.10months
4.None of the above
Choose your answer:3
Wrong Answer!

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as10
How many months are there in a year?
1.12months
2.11months
3.10months
4.None of the above
Choose your answer:4
Wrong Answer!

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as10
How many months are there in a year?
1.12months
2.11months
3.10months
4.None of the above
Choose your answer:5
Invalid choice

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>
*/