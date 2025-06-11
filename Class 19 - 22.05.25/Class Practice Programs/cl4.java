import java.util.Scanner;
class cl4
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.print("Enter Character:");
		int a = sc.nextInt();
		if (a >= 0 && a <= 30)
		{
			System.out.println("Mars");
		}
		else if (a >= 31 && a <= 60)
		{
			System.out.println("Moon");
		}
		else if (a >= 61 && a <= 90)
		{
			System.out.println("Jupiter");
		}
		else if (a >= 91 && a <= 100)
		{
			System.out.println("Earth");
		}
		else
		{
			System.out.println("Invalid");
		}

	}
}
/*
Output:
D:\QSPIDER\JAVA\22.05.25 - Class 19\Class Practice Programs>javac cl4.java

D:\QSPIDER\JAVA\22.05.25 - Class 19\Class Practice Programs>java cl4
Enter Character:5
Mars

D:\QSPIDER\JAVA\22.05.25 - Class 19\Class Practice Programs>java cl4
Enter Character:40
Moon

D:\QSPIDER\JAVA\22.05.25 - Class 19\Class Practice Programs>java cl4
Enter Character:70
Jupiter

D:\QSPIDER\JAVA\22.05.25 - Class 19\Class Practice Programs>java cl4
Enter Character:95
Earth

D:\QSPIDER\JAVA\22.05.25 - Class 19\Class Practice Programs>java cl4
Enter Character:101
Invalid

D:\QSPIDER\JAVA\22.05.25 - Class 19\Class Practice Programs>
*/