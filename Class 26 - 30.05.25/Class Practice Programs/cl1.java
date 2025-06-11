import java.util.Scanner;
class cl1
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter number:");
		int n = sc.nextInt();
		int temp = n;
		while (n!=4 && n!=1)
		{
			int sum=0,p=0,l;
			while (n>0)
			{
				l=n%10;
				p=l*l;
				//System.out.println("Sq:"+p);
				sum=sum+p;
				n=n/10;
				//System.out.println("Sum:"+sum);
			}
			n=sum;
		}
		if (n==1)
		{
			System.out.println(temp+" is a Happy Number");
		}
		else
		{
			System.out.println(temp+" is not a Happy Number");
		}	
	}	
}
/*
Output:
D:\QSPIDER\JAVA\30.05.25 - Class 26\Class Practice Programs>javac cl1.java

D:\QSPIDER\JAVA\30.05.25 - Class 26\Class Practice Programs>java cl1
Enter number:94
Sq:16
Sum:16
Sq:81
Sum:97
Sq:49
Sum:49
Sq:81
Sum:130
Sq:0
Sum:0
Sq:9
Sum:9
Sq:1
Sum:10
Sq:0
Sum:0
Sq:1
Sum:1
Happy

D:\QSPIDER\JAVA\29.05.25 - Class 25\Class Practice Programs>
*/