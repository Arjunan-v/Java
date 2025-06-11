import java.util.Scanner;
class as1
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		int i = 0;
		int sum =0;
		int count = 0;
		System.out.print("Enter n:");
		int n = sc.nextInt();
		while (n>0)
		{
			i = n%10;
			++count;
			n = n/10;
		}
		System.out.println("Digits :"+count);
	}
}
/*
Output:
D:\QSPIDER\JAVA\26.05.25 - Class 22\Assignment>java as1
Enter n:123456
Digits :6

D:\QSPIDER\JAVA\26.05.25 - Class 22\Assignment>java as1
Enter n:632
Digits :3

D:\QSPIDER\JAVA\26.05.25 - Class 22\Assignment>
*/