class p7
{
	public static void main(String[] args) throws Exception
	{
		int n=5;
		//2 matrix
		for (int i=0;i<n ;i++ )
		{
			//1st matrix
			for (int j=0;j<n ;j++ )
			{
				if (true)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				//Thread.sleep(1000);
			}

			System.out.print("    ");

			//2nd matrix
			for (int j=0;j<n ;j++ )
			{
				if (true)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print("  ");
				}
				//Thread.sleep(1000);
			}
			System.out.println();

		}
		
	}
}

/*

i==0 -> first row
j==0 -> first column
i==n-1 -> last row
j==n-1 -> last column
i==n/2 -> middle row
j==n/2 -> middle column
i==n -> left diagonal
i+j==n-1 -> right diagonal

top quadrant -> i<=n/2
below quadrant -> i>=n/2
left quadrant -> j<=n/2
right quadrant -> j>=n/2


Output:
D:\QSPIDER\JAVA\Class 29 - 02.06.25\Class Practice Programs>javac p7.java

D:\QSPIDER\JAVA\Class 29 - 02.06.25\Class Practice Programs>java p7
* * * * *     0 1 2 3 4
* * * * *     0 1 2 3 4
* * * * *     0 1 2 3 4
* * * * *     0 1 2 3 4
* * * * *     0 1 2 3 4

D:\QSPIDER\JAVA\Class 29 - 02.06.25\Class Practice Programs>
*/