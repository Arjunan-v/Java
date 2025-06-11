import java.util.Scanner;
class cl4 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter number:");
		int n = sc.nextInt();
		int count=0,sum=0,f=0,t,l=0,s=0;
		l = n%10;
		int first = 0;
		for (int i=n;i>0;i/=10)
		{
			first = i%10;
		}
		s = first+l;
		System.out.println("Sum of last 2 digits:"+s);
		while (n>9)
		{
			t = n%10;
			if (t==l || t==f)
			{
				count=count+1;
			}
			else
			{
				sum=sum+t;
			}
			n=n/10;
		}
		System.out.println("Sum of insidde digits:"+sum);
		//System.out.println(s);
		//System.out.println(sum);
		if (s == sum)
		{
			System.out.println("Xylum");
		}
		else
		{
			System.out.println("Not Xylum");
		}
	}	
}
/*
Output:
D:\QSPIDER\JAVA\29.05.25 - Class 25\Class Practice Programs>java cl4
Enter number:1234
Sum of last 2 digits:5
Sum of insidde digits:5
Xylum

D:\QSPIDER\JAVA\29.05.25 - Class 25\Class Practice Programs>java cl4
Enter number:24136
Sum of last 2 digits:8
Sum of insidde digits:8
Xylum

D:\QSPIDER\JAVA\29.05.25 - Class 25\Class Practice Programs>java cl4
Enter number:123456
Sum of last 2 digits:7
Sum of insidde digits:14
Not Xylum

D:\QSPIDER\JAVA\29.05.25 - Class 25\Class Practice Programs>
*/