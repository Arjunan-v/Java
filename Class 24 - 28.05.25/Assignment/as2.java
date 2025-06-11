import java.util.Scanner;
class as2
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter number:");
		int n = sc.nextInt();
		int last = 0;
		last = n%10;
		System.out.println("last digit is : "+last);
		int first = 0;
		for (int i=n;i>0;i/=10)
		{
			first = i%10;
		}
		int sum = first+last;
		System.out.println("First digit is :" +first);
		System.out.println("Sum is "+sum);
	}
}
/*
Output:
D:\QSPIDER\JAVA\28.05.25 - Class 24\Assignment>javac as2.java

D:\QSPIDER\JAVA\28.05.25 - Class 24\Assignment>java as2
Enter number:123
last digit is : 3
First digit is :1
Sum is 4

D:\QSPIDER\JAVA\28.05.25 - Class 24\Assignment>java as2
Enter number:12345
last digit is : 5
First digit is :1
Sum is 6

D:\QSPIDER\JAVA\28.05.25 - Class 24\Assignment>java as2
Enter number:123456
last digit is : 6
First digit is :1
Sum is 7

D:\QSPIDER\JAVA\28.05.25 - Class 24\Assignment>
*/