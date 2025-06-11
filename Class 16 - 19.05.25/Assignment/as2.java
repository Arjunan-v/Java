import java.util.Scanner;
class as2
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{

		System.out.print("Enter Number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Number 2: ");
		int num2 = sc.nextInt();

		System.out.println("Number 1 : "+num1);
		System.out.println("Number 2 : "+num2);

		String res = (num1 > num2) ? "Number 1 is Greater than Number 2" : "Number 2 is greater than Number 1";
		System.out.println("Result : "+res);



	}
}
/*
Output:
D:\QSPIDER\JAVA\18.05.25 - Class 16\Assignment>javac as2.java

D:\QSPIDER\JAVA\18.05.25 - Class 16\Assignment>java as2
Enter Number 1: 5
Enter Number 2: 7
Number 1 : 5
Number 2 : 7
Result : Number 2 is greater than Number 1

D:\QSPIDER\JAVA\18.05.25 - Class 16\Assignment>java as2
Enter Number 1: 9
Enter Number 2: 5
Number 1 : 9
Number 2 : 5
Result : Number 1 is Greater than Number 2

D:\QSPIDER\JAVA\18.05.25 - Class 16\Assignment>
*/