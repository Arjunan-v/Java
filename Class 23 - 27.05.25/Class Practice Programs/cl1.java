import java.util.Scanner;
class cl1
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		boolean flag = true;
		int a=0;
		int b=0;
		do
		{
			System.out.println("Select:");
			System.out.println("1.Addition\n2.Subraction\n3.Multiplication\n4.Exit");
			int c = sc.nextInt();

			switch (c)
			{
			case 1:
				{
					System.out.println("Addition");
					System.out.println("-----------");
					System.out.print("Enter a:");
					a=sc.nextInt();
					System.out.print("Enter b:");
					b = sc.nextInt();
					System.out.println("Sum : "+ (a+b));
					break;
				}
				case 2:
				{
					System.out.println("Subraction:");
					System.out.println("-------------");
					System.out.print("Enter a:");
					a=sc.nextInt();
					System.out.print("Enter b:");
					b = sc.nextInt();
					System.out.println("subraction :"+ (a-b));
					break;
				}
				case 3:
				{
					System.out.println("Multiplication:");
					System.out.println("------------------");
					System.out.print("Enter a:");
					a=sc.nextInt();
					System.out.print("Enter b:");
					b = sc.nextInt();
					System.out.println("Multiplication: "+ (a*b));
					break;
				}
				case 4:
				{
					flag = false;
					break;
				}
				default:
				{
					System.out.println("Invalid Choice");
				}
			
			}
		}
		while (flag);
		System.out.println("Thanks!");
	}
}
/*
Output:
D:\QSPIDER\JAVA\27.05.25 - Class 23\Class Practice Programs>javac cl1.java

D:\QSPIDER\JAVA\27.05.25 - Class 23\Class Practice Programs>java cl1
Select:
1.Addition
2.Subraction
3.Multiplication
4.Exit
1
Addition
-----------
Enter a:5
Enter b:6
Sum : 11
Select:
1.Addition
2.Subraction
3.Multiplication
4.Exit
2
Subraction:
-------------
Enter a:4
Enter b:2
subraction :2
Select:
1.Addition
2.Subraction
3.Multiplication
4.Exit
3
Multiplication:
------------------
Enter a:5
Enter b:6
Multiplication: 30
Select:
1.Addition
2.Subraction
3.Multiplication
4.Exit
4
Thanks!

D:\QSPIDER\JAVA\27.05.25 - Class 23\Class Practice Programs>
*/