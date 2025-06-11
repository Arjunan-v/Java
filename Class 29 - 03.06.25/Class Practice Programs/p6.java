class p6
{
	public static void main(String[] args) throws Exception
	{
		int n=11;
		char a='A';
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				
				if (i+j==n-1 && j>=n/2)
				{
					System.out.print("* ");
					++a;
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
D:\QSPIDER\JAVA\Class 29 - 02.06.25\Class Practice Programs>javac as1.java

D:\QSPIDER\JAVA\Class 29 - 02.06.25\Class Practice Programs>java as1
A B C D E
0 1 2 3 4
A B C D E
0 1 2 3 4
A B C D E

D:\QSPIDER\JAVA\Class 29 - 02.06.25\Class Practice Programs>
*/