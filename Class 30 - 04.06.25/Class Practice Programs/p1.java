class p1
{
	public static void main(String[] args) throws Exception
	{
		int n=5,a=1;
		for (int i=0;i<n ;i++ )
		{
			a=1;
			for (int j=0;j<n ;j++ )
			{
				if (i>=j)
				{
					System.out.print((a++) +" ");
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
D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>javac p1.java

D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>java p1
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>
*/