import java.util.Scanner;
class cl1
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.print("Enter Number:");
		int a = sc.nextInt();

		switch(a)
		{
			case 1:System.out.println("Sunday");
			break;
			case 2:System.out.println("Monday");
			break;
			case 3:System.out.println("Tuesday");
			break;
			case 4:System.out.println("Wednesday");
			break;
			case 5:System.out.println("Thursday");
			break;
			case 6:System.out.println("Friday");
			break;
			case 7:System.out.println("Saturday");
			break;
			default:System.out.println("Invalid");
			break;
		}

	}
}
/*
Output:
D:\QSPIDER\JAVA\23.05.25 - Class 20\Class Practice Programs>javac cl1.java

D:\QSPIDER\JAVA\23.05.25 - Class 20\Class Practice Programs>java cl1
Enter Number:1
Sunday

D:\QSPIDER\JAVA\23.05.25 - Class 20\Class Practice Programs>java cl1
Enter Number:2
Monday

D:\QSPIDER\JAVA\23.05.25 - Class 20\Class Practice Programs>java cl1
Enter Number:3
Tuesday

D:\QSPIDER\JAVA\23.05.25 - Class 20\Class Practice Programs>java cl1
Enter Number:4
Wednesday

D:\QSPIDER\JAVA\23.05.25 - Class 20\Class Practice Programs>java cl1
Enter Number:5
Thursday

D:\QSPIDER\JAVA\23.05.25 - Class 20\Class Practice Programs>java cl1
Enter Number:6
Friday

D:\QSPIDER\JAVA\23.05.25 - Class 20\Class Practice Programs>java cl1
Enter Number:7
Saturday

D:\QSPIDER\JAVA\23.05.25 - Class 20\Class Practice Programs>
*/