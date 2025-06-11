import java.util.Scanner;
class cl3
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter number:");
		int n = sc.nextInt();
		int temp=n,count=0,sum=0;
		while (n>0)
		{
			++count;
			n=n/10;
		}
		//System.out.println("Total Digits "+count);
		n = temp;
		while (n>0)
		{
			int l=n%10;
			int p=1;
			for (int j=1;j<=count ;j++ )
			{
				p = p*l;
			}
			sum=sum+p;
			n=n/10;
		}
		//System.out.println(sum);
		if (sum == temp)
		{
			System.out.println(temp +" is a Amstrong Number");
		}
		else
		{
			System.out.println(temp +" is not a Amstrong Number");
		}
	}
	
}
/*
Output:
D:\QSPIDER\JAVA\31.05.25 - Class 27\Class Practice Programs>java cl3
Enter number:153
153 is a Amstrong Number

D:\QSPIDER\JAVA\31.05.25 - Class 27\Class Practice Programs>
*/