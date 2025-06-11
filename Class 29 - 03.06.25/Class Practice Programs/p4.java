class p4
{
	public static void main(String[] args) throws Exception
	{
		int n=5;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (true)
				{
					System.out.print(j%2+" ");
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

Output:
D:\QSPIDER\JAVA\Class 29 - 02.06.25\Class Practice Programs>javac p3.java

D:\QSPIDER\JAVA\Class 29 - 02.06.25\Class Practice Programs>java p3.java
0 1 0 1 0
0 1 0 1 0
0 1 0 1 0
0 1 0 1 0
0 1 0 1 0

D:\QSPIDER\JAVA\Class 29 - 02.06.25\Class Practice Programs>
*/