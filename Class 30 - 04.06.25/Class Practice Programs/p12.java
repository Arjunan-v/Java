class p12
{
	public static void main(String[] args) throws Exception
	{
		int n=11;
		for (int i=0;i<n ;i++ )
		{
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
			}
				
			System.out.print("    ");
				
			for (int j=0;j<n ;j++ )
			{
				if (i>=j+n/2 || i<=j-n/2 || (i==n/2 && j==n/2) || i+j>=n-1+n/2 || i+j<=n-1-n/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}

			System.out.print("    ");

			for (int j=0;j<n ;j++ )
			{
				if (i==0 || j==0 || i==n-1 ||j==n-1 || i>=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
				
			System.out.print("    ");

			for (int j=0;j<n ;j++ )
			{
				if (i==0 || j==0 || i==n-1 ||j==n-1 || i<=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
				
			System.out.print("    ");

			System.out.println();
		}
		
	}
}
/*
Output:
D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>javac p12.java

D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>java p12
                          * * * * * * * * * * *     * * * * * * * * * * *     * * * * * * * * * * *
          *               * * * * *   * * * * *     * *                 *     * * * * * * * * * * *
        * * *             * * * *       * * * *     * * *               *     *   * * * * * * * * *
      * * * * *           * * *           * * *     * * * *             *     *     * * * * * * * *
    * * * * * * *         * *               * *     * * * * *           *     *       * * * * * * *
  * * * * * * * * *       *         *         *     * * * * * *         *     *         * * * * * *
    * * * * * * *         * *               * *     * * * * * * *       *     *           * * * * *
      * * * * *           * * *           * * *     * * * * * * * *     *     *             * * * *
        * * *             * * * *       * * * *     * * * * * * * * *   *     *               * * *
          *               * * * * *   * * * * *     * * * * * * * * * * *     *                 * *
                          * * * * * * * * * * *     * * * * * * * * * * *     * * * * * * * * * * *

D:\QSPIDER\JAVA\Class 30 - 04.06.25\Class Practice Programs>
*/
