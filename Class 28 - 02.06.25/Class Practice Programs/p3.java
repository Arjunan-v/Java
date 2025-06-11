class p3
{
	public static void main(String[] args) throws Exception
	{
		//4 rows for loop
		for (int i=0;i<4 ;i++ )
		{
			//7 columns for loop
			for (int j=0;j<7 ;j++ )
			{
				if (true)
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
D:\QSPIDER\JAVA\01.06.25 - Class 28\Class Practice Programs>javac p3.java

D:\QSPIDER\JAVA\01.06.25 - Class 28\Class Practice Programs>java p3
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *

D:\QSPIDER\JAVA\01.06.25 - Class 28\Class Practice Programs>
*/