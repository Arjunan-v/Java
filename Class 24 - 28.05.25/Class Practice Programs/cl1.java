import java.util.Scanner;
class cl1
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		boolean flag1 = true;
		do
		{
			System.out.println("Select the Input:");
			System.out.println("1.Display Info\n2.Favourite Game\n3.Exit");
			int c = sc.nextInt();
			switch (c)
			{
			case 1:
				{
					boolean flag2 = true;
					do
					{
						System.out.println("Select the Input:");
						System.out.println("1. Display Name");
						System.out.println("2. Display DOB");
						System.out.println("3. Exit");
						int c1 = sc.nextInt();
						switch (c1)
						{
						case 1:
							{
								System.out.println("Name : Venkateshwaran");
								break;
							}
						case 2:
							{
								System.out.println("DOB : 04-09-1998");
								break;
							}
						case 3:
							{
								flag2 = false;
								break;
							}
						default:
							{
								System.out.println("Invalid Choice");
								break;
							}
					
					}
					}while (flag2);
					break;
				}
				case 2:
				{
					boolean flag3 = true;
					do
					{
						System.out.println("Select Game:");
						System.out.println("1. PUBG");
						System.out.println("2. FreeFire");
						System.out.println("3. Exit");
						int c1 = sc.nextInt();
						switch (c1)
						{
						case 1:
							{
								System.out.println("Your Favourite Game is PUBG");
								break;
							}
						case 2:
							{
								System.out.println("Your Favourite Game is Freefire");
								break;
							}
						case 3:
							{
								flag3 = false;
								break;
							}
						default:
							{
								System.out.println("Invalid Choice");
								break;
							}
					
					}
					}while (flag3);
					break;
				}
				case 3:
				{
					flag1 = false;
					break;
				}
				default:
				{
					System.out.println("Invalid Choice");
					break;
				}
			
			}
		}
		while (flag1);
		System.out.println("Thanks!");
	}
}
/*
Output:
D:\QSPIDER\JAVA\28.05.25 - Class 24\Class Practice Programs>javac cl1.java

D:\QSPIDER\JAVA\28.05.25 - Class 24\Class Practice Programs>java cl1
Select the Input:
1.Display Info
2.Favourite Game
3.Exit
1
Select the Input:
1. Display Name
2. Display DOB
3. Exit
1
Name : Venkateshwaran
Select the Input:
1. Display Name
2. Display DOB
3. Exit
2
DOB : 04-09-1998
Select the Input:
1. Display Name
2. Display DOB
3. Exit
3
Select the Input:
1.Display Info
2.Favourite Game
3.Exit
2
Select Game:
1. PUBG
2. FreeFire
3. Exit
1
Your Favourite Game is PUBG
Select Game:
1. PUBG
2. FreeFire
3. Exit
2
Your Favourite Game is Freefire
Select Game:
1. PUBG
2. FreeFire
3. Exit
3
Select the Input:
1.Display Info
2.Favourite Game
3.Exit
3
Thanks!

D:\QSPIDER\JAVA\28.05.25 - Class 24\Class Practice Programs>
*/