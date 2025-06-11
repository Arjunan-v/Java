import java.util.Scanner;
class as1
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter number:");
		int n = sc.nextInt();
		for (int i=1;i<=10 ;i++ )
		{
			System.out.println(n+"*"+i+"="+(n*i));			
		}
	}
}
/*
Output:
D:\QSPIDER\JAVA\28.05.25 - Class 24\Assignment>javac as1.java

D:\QSPIDER\JAVA\28.05.25 - Class 24\Assignment>java as1
Enter number:3
3*1=3
3*2=6
3*3=9
3*4=12
3*5=15
3*6=18
3*7=21
3*8=24
3*9=27
3*10=30

D:\QSPIDER\JAVA\28.05.25 - Class 24\Assignment>
*/