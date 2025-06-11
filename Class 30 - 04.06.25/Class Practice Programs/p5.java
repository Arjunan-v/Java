//Pascal Triangle
class p5
{
	public static void main(String[] args) throws Exception
	{
		int n=7;
		for (int i=0;i<n ;i++ )
		{
			//a=5;
			for (int j=0;j<n ;j++ )
			{
				if (i>=j && i+j>=n-1)
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
//Pascal Triangle
D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>javac p5.java

D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>java p5



      *
    * * *
  * * * * *
* * * * * * *

D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>
*/