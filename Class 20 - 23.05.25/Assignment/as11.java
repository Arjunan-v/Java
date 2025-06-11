import java.util.Scanner;
class as11
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		double b = 10000.0;
		System.out.println("Banking Operations\n1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
		System.out.print("Choose your answer:");
		int a = sc.nextInt();
		switch(a)
		{
			case 1:
			{
				System.out.print("Enter the amount to deposit:");
				double d = sc.nextDouble();
				b = b+d;
				System.out.println("Amount Deposited");
				System.out.println("New Balance : "+b);
				break;
			}
			case 2:
			{
				System.out.print("Enter the amount to withdraw:");
				double e = sc.nextDouble();
				b = b-e;
				System.out.println("Amount Withdrawn");
				System.out.println("New Balance : "+b);
				break;
			}
			case 3:
			{
				System.out.println("Balance : "+b);
				break;
			}
			case 4:
			{
				break;
			}
			default:
				System.out.println("Invalid choice");
		}
		System.out.println("Exited");
	}
}
/*
Output:
D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>javac as11.java

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as11
Banking Operations
1.Deposit
2.Withdraw
3.Check Balance
4.Exit
Choose your answer:3
Balance : 10000.0
Exited

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as11
Banking Operations
1.Deposit
2.Withdraw
3.Check Balance
4.Exit
Choose your answer:1
Enter the amount to deposit:5000
Amount Deposited
New Balance : 15000.0
Exited

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as11
Banking Operations
1.Deposit
2.Withdraw
3.Check Balance
4.Exit
Choose your answer:2
Enter the amount to withdraw:5000
Amount Withdrawn
New Balance : 5000.0
Exited

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as11
Banking Operations
1.Deposit
2.Withdraw
3.Check Balance
4.Exit
Choose your answer:4
Exited

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>
*/