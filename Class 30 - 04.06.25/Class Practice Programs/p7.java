//Sandclock
class p7
{
	public static void main(String[] args) throws Exception
	{
		int n=11;
		for (int i=0;i<n ;i++ )
		{
			//a=5;
			for (int j=0;j<n ;j++ )
			{
				if (i<=j && i+j<=n-1 || i+j>=n-1 && i>=j)
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
//Sandclock
D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>javac p7.java

D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>java p7
* * * * * * * * * * *
  * * * * * * * * *
    * * * * * * *
      * * * * *
        * * *
          *
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
* * * * * * * * * * *

D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>
*/