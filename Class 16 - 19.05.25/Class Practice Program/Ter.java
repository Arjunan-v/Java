import java.util.Scanner;
class Ter
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{

		System.out.print("Enter Student Id: ");
		int id = sc.nextInt();
		System.out.println("Student Id : "+id);
		
		String res = (id>0) ? "Positive Number" : "Negative Number";
		System.out.println("Result : "+res);



	}
}
/*
Output:
D:\QSPIDER\JAVA\18.05.25 - Class 16\Class Practice Program>javac Ter.java

D:\QSPIDER\JAVA\18.05.25 - Class 16\Class Practice Program>java Ter
Enter Student Id: 78
Student Id : 78
Result : Positive Number

D:\QSPIDER\JAVA\18.05.25 - Class 16\Class Practice Program>java Ter
Enter Student Id: -78
Student Id : -78
Result : Negative Number

D:\QSPIDER\JAVA\18.05.25 - Class 16\Class Practice Program>
*/