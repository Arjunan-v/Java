import java.util.*;
class ArrayDigitalSum 
{
	public static void main(String[] args) 
	{
		int [] a = {123,24,17,13,18,1234};
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]%2==0)
			{
				int temp=a[i];
				int sum=0;
				while (temp>0)
				{
					int l=temp%10;
					sum=sum+l;
					temp=temp/10;
				}
				a[i]=sum;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
/*
Output:
D:\QSPIDER\JAVA\Class 36 - 11.06.25\Assignment>javac ArrayDigitalSum.java

D:\QSPIDER\JAVA\Class 36 - 11.06.25\Assignment>java ArrayDigitalSum
[123, 6, 17, 13, 9, 10]

D:\QSPIDER\JAVA\Class 36 - 11.06.25\Assignment>
*/