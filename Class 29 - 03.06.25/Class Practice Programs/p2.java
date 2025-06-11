class p2
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
					System.out.print(j+1+" ");
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
D:\QSPIDER\JAVA\Class 29 - 02.06.25\Class Practice Programs>javac p2.java

D:\QSPIDER\JAVA\Class 29 - 02.06.25\Class Practice Programs>java p2
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5

D:\QSPIDER\JAVA\Class 29 - 02.06.25\Class Practice Programs>
*/