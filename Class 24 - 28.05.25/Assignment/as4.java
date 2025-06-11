import java.util.Scanner;
class as4
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter number:");
		int n = sc.nextInt();//012345
		int ecount=0,ocount=0,zcount=0,count=0,t;
		for (int i=n;i>0;i=i/10)
		{
			t=i%10;
			//System.out.println(i);
			//System.out.println(count+1);
			if (t == 0)
			{
				++zcount;
			}
			else if (t%2 == 0)
			{
				++ecount;
			}
			else
			{
				++ocount;
			}
		}
		System.out.println("Even :"+ecount);
		System.out.println("Odd :"+ocount);
		System.out.println("Zero :"+zcount);
	}
}
/*
Output:
D:\QSPIDER\JAVA\28.05.25 - Class 24\Assignment>javac as4.java

D:\QSPIDER\JAVA\28.05.25 - Class 24\Assignment>java as4
Enter number:1034732
Even :2
Odd :4
Zero :1

D:\QSPIDER\JAVA\28.05.25 - Class 24\Assignment>
*/