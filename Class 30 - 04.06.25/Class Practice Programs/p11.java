class p11
{
	public static void main(String[] args) throws Exception
	{
		int n=11;
		for (int i=0;i<n ;i++ )
		{
			//a=5;
			for (int j=0;j<n ;j++ )
			{
				if (i>=j+n/2 || i<=j-n/2 || i+j>=n-1+n/2 || i+j<=n-1-n/2)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
				
				//Thread.sleep(1000);
			}
			System.out.println();
		}
		
	}
}
/*
Output:
D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>javac p11.java

D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>java p11

          *
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
    * * * * * * *
      * * * * *
        * * *
          *


D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>
*/
