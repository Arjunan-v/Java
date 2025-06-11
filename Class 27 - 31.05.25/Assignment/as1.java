import java.util.Scanner;
class as1
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter start number:");
		int start = sc.nextInt();
		System.out.print("Enter end number:");
		int end = sc.nextInt();
		for (int i=start;i<=end;i++)
		{
			if (i<=1)
			{
				continue;
			}
			boolean flag=true;
			for (int j=2;j<=i/2 ;j++ )
			{
				if (i%j==0)
				{
					flag = false;
					break;
				}
			}
			if (flag)
			{
				System.out.print(i+" ");
			}
		}
	}
	
}
/*
Output:
D:\QSPIDER\JAVA\31.05.25 - Class 27\Assignment>javac as1.java

D:\QSPIDER\JAVA\31.05.25 - Class 27\Assignment>java as1
Enter start number:2
Enter end number:10
2 3 5 7
D:\QSPIDER\JAVA\31.05.25 - Class 27\Assignment>
*/