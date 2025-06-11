import java.util.Scanner;
class as1
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{

		System.out.print("Enter value: ");
		char a = sc.next().charAt(0);

		String res = (a>='A' && a<='Z')?"Uppercase":(a>='a' && a<='z')?"Lowercase":(a>='0' && a<='9')?"Integer":"Special Characters";
		System.out.println("Result : "+res);
	}
}
/*
Output:
D:\QSPIDER\JAVA\20.05.25 - Class 17\Assignment>javac as1.java

D:\QSPIDER\JAVA\20.05.25 - Class 17\Assignment>java as1
Enter Number: a
Result : Lowercase

D:\QSPIDER\JAVA\20.05.25 - Class 17\Assignment>javac as1.java

D:\QSPIDER\JAVA\20.05.25 - Class 17\Assignment>java as1
Enter value: A
Result : Uppercase

D:\QSPIDER\JAVA\20.05.25 - Class 17\Assignment>java as1
Enter value: v
Result : Lowercase

D:\QSPIDER\JAVA\20.05.25 - Class 17\Assignment>java as1
Enter value: 3
Result : Integer

D:\QSPIDER\JAVA\20.05.25 - Class 17\Assignment>java as1
Enter value: !
Result : Special Characters

D:\QSPIDER\JAVA\20.05.25 - Class 17\Assignment>
*/