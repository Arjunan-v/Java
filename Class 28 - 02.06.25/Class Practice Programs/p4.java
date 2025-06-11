class p4
{
	public static void main(String[] args) throws Exception
	{
		//5 rows for loop
		for (int i=0;i<5 ;i++ )
		{
			//5 columns for loop
			for (int j=0;j<5 ;j++ )
			{
				if (true)
				{
					System.out.print("$ ");
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
D:\QSPIDER\JAVA\01.06.25 - Class 28\Class Practice Programs>javac p4.java

D:\QSPIDER\JAVA\01.06.25 - Class 28\Class Practice Programs>java p4
$ $ $ $ $
$ $ $ $ $
$ $ $ $ $
$ $ $ $ $
$ $ $ $ $

D:\QSPIDER\JAVA\01.06.25 - Class 28\Class Practice Programs>
*/