import java.util.Scanner;
class as2
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{

		System.out.print("Enter percentage: ");
		int a = sc.nextInt();

		String res = (a>100 || a<0)?"Invalid":(a>=90)?"A Grade":(a>=60)?"B Grade":(a>=35)?"C Grade":(a<35)?"Fail":"Invalid";
		System.out.println("Result : "+res);
	}
}
/*
Output:
D:\QSPIDER\JAVA\20.05.25 - Class 17\Assignment>javac as2.java

D:\QSPIDER\JAVA\20.05.25 - Class 17\Assignment>java as2
Enter percentage: 100
Result : A Grade

D:\QSPIDER\JAVA\20.05.25 - Class 17\Assignment>java as2
Enter percentage: 101
Result : Invalid

D:\QSPIDER\JAVA\20.05.25 - Class 17\Assignment>java as2
Enter percentage: -5
Result : Invalid

D:\QSPIDER\JAVA\20.05.25 - Class 17\Assignment>java as2
Enter percentage: 90
Result : A Grade

D:\QSPIDER\JAVA\20.05.25 - Class 17\Assignment>java as2
Enter percentage: 65
Result : B Grade

D:\QSPIDER\JAVA\20.05.25 - Class 17\Assignment>java as2
Enter percentage: 59
Result : C Grade

D:\QSPIDER\JAVA\20.05.25 - Class 17\Assignment>java as2
Enter percentage: 33
Result : Fail

D:\QSPIDER\JAVA\20.05.25 - Class 17\Assignment>
*/