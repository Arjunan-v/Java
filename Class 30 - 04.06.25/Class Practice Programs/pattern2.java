class pattern2
{
	public static void main(String[] args) throws Exception
	{
		int n=5;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i+j<=n-1)
				{
					System.out.print("* ");
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
Output:
D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>javac pattern2.java

D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>java pattern2
* * * * *
* * * *
* * *
* *
*

D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>
*/