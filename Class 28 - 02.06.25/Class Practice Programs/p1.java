class p1 
{
	public static void main(String[] args) throws Exception
	{
		//2 rows for loop
		for (int i=0;i<2 ;i++ )
		{
			//3 columns for loop
			for (int j=0;j<3 ;j++ )
			{
				if (true)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				Thread.sleep(1000);
			}
			System.out.println();
		}
		
	}
}
