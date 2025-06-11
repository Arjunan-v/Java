import java.util.Scanner;
class Calc 
{
	static Scanner sc = new Scanner(System.in);

	public static double add(int a,int b)
	{
		return a+b;
	}
	public static double sub(int a,int b)
	{
		return a-b;
	}
	public static double mul(int a,int b)
	{
		return a*b;
	}
	public static double div(int a,int b)
	{
		return a/b;
	}

	public static void main(String[] args) 
	{
		System.out.println("CALCULATOR");
		System.out.println("------------------");
		boolean flag = true;
		do
		{
			System.out.println("1.Addition\n2.Subraction\n3.Multiplication\n4.Division\n5.Exit");
			int input = sc.nextInt();
			if (input!=5)
			{
				System.out.print("Enter a:");
				int a=sc.nextInt();
				System.out.print("Enter b:");
				int b = sc.nextInt();
				switch (input)
				{
				case 1:
					{
						System.out.println("Addition of a and b is : "+add(a,b));
						System.out.println();
						break;
					}
				case 2:
					{
						System.out.println("Subraction of a and b is : "+sub(a,b));
						System.out.println();
						break;
					}
				case 3:
					{
						System.out.println("Multiplication of a and b is : "+mul(a,b));
						System.out.println();
						break;
					}
				case 4:
					{
						System.out.println("Division of a and b is : "+div(a,b));
						System.out.println();
						break;
					}
				}
			}
			else 
			{
				flag = false;
			}
		}
		while (flag);
	}
}
/*
Output:
D:\QSPIDER\JAVA\Class 31- 07.06.25\Class Practice Programs>javac Calc.java

D:\QSPIDER\JAVA\Class 31- 07.06.25\Class Practice Programs>java Calc
CALCULATOR
------------------
1.Addition
2.Subraction
3.Multiplication
4.Division
5.Exit
1
Enter a:20
Enter b:10
Addition of a and b is : 30.0

1.Addition
2.Subraction
3.Multiplication
4.Division
5.Exit
2
Enter a:20
Enter b:10
Subraction of a and b is : 10.0

1.Addition
2.Subraction
3.Multiplication
4.Division
5.Exit
3
Enter a:20
Enter b:10
Multiplication of a and b is : 200.0

1.Addition
2.Subraction
3.Multiplication
4.Division
5.Exit
4
Enter a:20
Enter b:10
Division of a and b is : 2.0

1.Addition
2.Subraction
3.Multiplication
4.Division
5.Exit
5

D:\QSPIDER\JAVA\Class 31- 07.06.25\Class Practice Programs>
*/