import java.util.Scanner;
class as7
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your wallet balance:");
		double a = sc.nextDouble();
		System.out.println("Enter your option:\nChoices:\n1.INR to USD\n2.INR to GBP\n");
		int b = sc.nextInt();
		switch(b)
		{
			case 1:
			{
				double m = a/85.98;
				System.out.println("Your balance in USD : "+m);
				break;
			}
			case 2:
			{
				double n =a/115.0;
				System.out.println("Your balance in GBP : "+n);
				break;
			}
			default:
				System.out.println("Invalid choice");
		}
	}
}
/*
Output:
D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>javac as7.java

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as7
Enter your wallet balance:86
Enter your option:
Choices:
1.INR to USD
2.INR to GBP

1
Your balance in USD : 1.0002326122354035

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as7
Enter your wallet balance:120
Enter your option:
Choices:
1.INR to USD
2.INR to GBP

2
Your balance in GBP : 1.0434782608695652

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>
*/