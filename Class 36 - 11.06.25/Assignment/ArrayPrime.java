import java.util.*;
class ArrayPrime 
{
	public static void main(String[] args) 
	{
		int [] a = {4,5,2,6,8,7,11};
		int sum=0;
		for (int i=0;i<a.length ;i++ )
		{
			int temp=a[i];
			boolean flag = true;
			if (temp==0 || temp==1)
			{
				flag = false;
			}
			for (int j=2;j<=temp/2;j++)
			{
				if (temp%j==0)
				{
					flag = false;
					break;
				}
			}
			if (flag)
			{
				sum=sum+temp;
			}
		}
		System.out.println("Sum of Prime Numbers in Array : "+sum);
	}
}
/*
Output:
D:\QSPIDER\JAVA\Class 36 - 11.06.25\Assignment>javac Arrayprime.java

D:\QSPIDER\JAVA\Class 36 - 11.06.25\Assignment>java ArrayPrime
Sum of Prime Numbers in Array : 25

D:\QSPIDER\JAVA\Class 36 - 11.06.25\Assignment>
*/