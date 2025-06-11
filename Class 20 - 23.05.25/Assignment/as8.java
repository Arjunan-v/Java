import java.util.Scanner;
class as8
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your animal:");
		System.out.println("Enter your option:\nChoices:\n1 - Dog\n2 - Cat\n3 - Cow\n");
		int a = sc.nextInt();
		switch(a)
		{
			case 1:
			{
				System.out.println("Dogs Bark");
				break;
			}
			case 2:
			{
				System.out.println("Cat meows");
				break;
			}
			case 3:
			{
				System.out.println("Cow moos");
				break;
			}
			default:
				System.out.println("Invalid choice");
		}
	}
}
/*
Output:
D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>javac as8.java

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as8
Enter your animal:Enter your option:
Choices:
1 - Dog
2 - Cat
3 - Cow

1
Dogs Bark

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as8
Enter your animal:Enter your option:
Choices:
1 - Dog
2 - Cat
3 - Cow

2
Cat meows

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as8
Enter your animal:Enter your option:
Choices:
1 - Dog
2 - Cat
3 - Cow

3
Cow moos

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>
*/