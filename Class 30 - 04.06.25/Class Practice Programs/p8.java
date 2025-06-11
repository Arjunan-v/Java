class p8
{
	public static void main(String[] args) throws Exception
	{
		int n=11;
		for (int i=0;i<n ;i++ )
		{
			//a=5;
			for (int j=0,a=1;j<n ;j++ )
			{
				if (i+j>=n-1 && i>=j)
				{
					System.out.print(a++ +" ");
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
D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>javac p8.java

D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>java p8





          1
        1 2 3
      1 2 3 4 5
    1 2 3 4 5 6 7
  1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9 10 11

D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>
*/