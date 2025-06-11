import java.util.Scanner;
class Stu
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{

		System.out.print("Enter Student Id: ");
		int id = sc.nextInt();
		System.out.print("Enter Marks: ");
		int marks = sc.nextInt();
		System.out.print("Enter Contact :");
		Long con = sc.nextLong();
		System.out.print("Enter Percentage: ");
		Double per = sc.nextDouble();
		System.out.print("Enter first letter of your name: ");
		char f = sc.next().charAt(0);

		System.out.println("Student Id : "+id);
		System.out.println("Marks : "+marks);
		System.out.println("Contact : "+con);
		System.out.println("Percentage : "+per);
		System.out.println("First Letter : "+f);

	}
}
/*
Output:
D:\QSPIDER\JAVA\18.05.25 - Class 16\Class Practice Program>javac Stu.java

D:\QSPIDER\JAVA\18.05.25 - Class 16\Class Practice Program>Java Stu
Enter Student Id: 78
Enter Marks: 85
Enter Contact :9840618844
Enter Percentage: 90
Enter first letter of your name: V
Student Id : 78
Marks : 85
Contact : 9840618844
Percentage : 90.0
First Letter : V

D:\QSPIDER\JAVA\18.05.25 - Class 16\Class Practice Program>
*/