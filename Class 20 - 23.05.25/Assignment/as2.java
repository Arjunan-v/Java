import java.util.Scanner;
class as2 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a");
		int a = sc.nextInt();
		System.out.print("Enter b");
		int b = sc.nextInt();
		System.out.println("Enter the operation:");
		System.out.println("Choices:\n+\n-\n*\n/");
		char c = sc.next().charAt(0);
		switch(c)
		{
			case '+':
			{
				System.out.println(a+b);
				break;
			}
			case '-':
			{
				System.out.println(a-b);
				break;
			}
			case '*':
			{
				System.out.println(a*b);
				break;
			}
			case '/':
			{
				System.out.println(a/b);
				break;
			}
			default:
				System.out.println("Invalid choice");
		}
	}
}
/*
Output:
D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>javac as2.java

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as2
Enter a10
Enter b20
Enter the operation:
Choices:
+
-
*
/
+
30

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as2
Enter a10
Enter b5
Enter the operation:
Choices:
+
-
*
/
-
5

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as2
Enter a10
Enter b5
Enter the operation:
Choices:
+
-
*
/
*
50

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as2
Enter a10
Enter b5
Enter the operation:
Choices:
+
-
*
/
/
2

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as2
Enter a10
Enter b5
Enter the operation:
Choices:
+
-
*
/
&
Invalid choice

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>
*/