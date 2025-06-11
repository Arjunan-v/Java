import java.util.Scanner;
class cl4
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter number:");
		int n = sc.nextInt();
		int temp=n,count=0,sum=0;
		boolean flag=true;
		while (n>0)
		{
			int l=n%10;
			if (l!=0 || l!=1)
			{
				for (int i=2;i<l;i++ )
				{
					flag = true;
					if (l%i==0)
					{
						flag = false;
						break;
					}
				}
				if (flag)
				{
					++count;
				}
			}
			n=n/10;
		}
		System.out.println(count);
	}
	
}
/*
Output:
D:\QSPIDER\JAVA\31.05.25 - Class 27\Class Practice Programs>javac cl4.java

D:\QSPIDER\JAVA\31.05.25 - Class 27\Class Practice Programs>java cl4
Enter number:42567
3

D:\QSPIDER\JAVA\31.05.25 - Class 27\Class Practice Programs>
*/