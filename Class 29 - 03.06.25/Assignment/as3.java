class as3
{
	public static void main(String[] args) throws Exception
	{
		int n=5,a=1;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (a<5)
				{
					if (true)
					{
						System.out.print((a++)+" ");
					}
					else
					{
						System.out.print(j+" ");
					}
				}
				else if (a>4)
				{
					a=1;
					if (true)
					{
						System.out.print((a++)+" ");
					}
					else
					{
						System.out.print(j+" ");
					}
				}
				
				//Thread.sleep(1000);
			}
			System.out.println();
		}
		
	}
}

/*
Output:
D:\QSPIDER\JAVA\Class 29 - 02.06.25\Assignment>javac as3.java

D:\QSPIDER\JAVA\Class 29 - 02.06.25\Assignment>java as3
1 2 3 4 1
2 3 4 1 2
3 4 1 2 3
4 1 2 3 4
1 2 3 4 1

D:\QSPIDER\JAVA\Class 29 - 02.06.25\Assignment>
*/