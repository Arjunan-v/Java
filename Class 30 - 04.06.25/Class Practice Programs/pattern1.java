class pattern1
{
	public static void main(String[] args) throws Exception
	{
		int n=5;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i+j>=n-1)
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
D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>javac pattern1.java

D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>java pattern1
        *
      * *
    * * *
  * * * *
* * * * *

D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>
*/