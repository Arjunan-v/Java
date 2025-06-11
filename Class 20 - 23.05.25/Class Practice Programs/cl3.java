import java.util.Scanner;
class cl3
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("Choices:");
		System.out.println("1.Food");
		System.out.println("2.Skill");
		System.out.print("Select the input:");
		int a = sc.nextInt();

		switch(a)
		{
			case 1:
			{
				System.out.println("Choices:");
				System.out.println("1.Idly");
				System.out.println("2.Pongal");
				System.out.print("Select the input:");
				int f = sc.nextInt();
				switch(f)
				{
					case 1:System.out.println("Idly : 80");
					break;
					case 2:System.out.println("Pongal : 70");
					break;
				}
			break;
			}
			case 2:
			{
				System.out.println("Choices:");
				System.out.println("1.Java");
				System.out.println("2.SQL");
				System.out.print("Select the input:");
				int g = sc.nextInt();
				switch(g)
				{
					case 1:System.out.println("Tabrez");
					break;
					case 2:System.out.println("Nagaraj");
					break;
				}
			break;
			}
			default:System.out.println("Invalid");
			break;
		}

	}
}
/*
Output:
D:\QSPIDER\JAVA\23.05.25 - Class 20\Class Practice Programs>javac cl3.java

D:\QSPIDER\JAVA\23.05.25 - Class 20\Class Practice Programs>java cl3
Choices:
1.Food
2.Skill
Select the input:1
Choices:
1.Idly
2.Pongal
Select the input:1
Idly : 80

D:\QSPIDER\JAVA\23.05.25 - Class 20\Class Practice Programs>java cl3
Choices:
1.Food
2.Skill
Select the input:1
Choices:
1.Idly
2.Pongal
Select the input:2
Pongal : 70

D:\QSPIDER\JAVA\23.05.25 - Class 20\Class Practice Programs>java cl3
Choices:
1.Food
2.Skill
Select the input:2
Choices:
1.Java
2.SQL
Select the input:1
Tabrez

D:\QSPIDER\JAVA\23.05.25 - Class 20\Class Practice Programs>java cl3
Choices:
1.Food
2.Skill
Select the input:2
Choices:
1.Java
2.SQL
Select the input:2
Nagaraj

D:\QSPIDER\JAVA\23.05.25 - Class 20\Class Practice Programs>
*/