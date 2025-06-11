import java.util.*;
class cl1
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter size:");
		int n=sc.nextInt();
		int [] a = new int [n];
		for (int i=0;i<a.length ;i++ )
		{
			System.out.print("Enter element "+i+":");
			a[i] = sc.nextInt();
		}

		System.out.println("Array in reverse order:");
		//Print in reverse order
		for (int i=a.length-1;i>=0 ;i-- )
		{
			System.out.print(a[i]);
		}

	}
}
/*
Output:
D:\QSPIDER\JAVA\Class 35- 10.06.25\Class Practice Programs>javac cl1.java

D:\QSPIDER\JAVA\Class 35- 10.06.25\Class Practice Programs>javac cl1.java

D:\QSPIDER\JAVA\Class 35- 10.06.25\Class Practice Programs>java cl1
Enter size:5
Enter element 0:1
Enter element 1:3
Enter element 2:5
Enter element 3:7
Enter element 4:9
Array in reverse order:
97531
D:\QSPIDER\JAVA\Class 35- 10.06.25\Class Practice Programs>
*/