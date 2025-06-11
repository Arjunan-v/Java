class as2
{
	public static void main(String[] args) throws Exception
	{
		int n=5;
		char a='A';
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (a<'D')
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
				else if (a>'C')
				{
					a='A';
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
D:\QSPIDER\JAVA\Class 29 - 02.06.25\Assignment>javac as2.java

D:\QSPIDER\JAVA\Class 29 - 02.06.25\Assignment>java as2
A B C A B
C A B C A
B C A B C
A B C A B
C A B C A

D:\QSPIDER\JAVA\Class 29 - 02.06.25\Assignment>
*/