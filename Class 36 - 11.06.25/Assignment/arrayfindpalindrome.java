import java.util.*;
class arrayfindpalindrome
{
	public static void main(String[] args) 
	{
		int [] a = {84,33,42,131,54,22};
		for (int i=0;i<a.length ;i++ )
		{
			int r=0;
			int temp=a[i];
			while (temp>0)
			{
				int m=temp%10;
				r=r*10;
				r=r+m;
				temp=temp/10;
			}
			if (r==a[i])
			{
				a[i]=-1;
			}
			//System.out.println(r);
		}
		System.out.println(Arrays.toString(a));
	}
}
/*
Output:
D:\QSPIDER\JAVA\Class 36 - 11.06.25\Assignment>java arrayfindpalindrome
[84, -1, 42, -1, 54, -1]

D:\QSPIDER\JAVA\Class 36 - 11.06.25\Assignment>
*/