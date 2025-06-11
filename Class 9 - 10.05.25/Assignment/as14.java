class as14
{
	public static void update()
	{
		int b = 2;
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		int a = 3;
	}
}
/*
output:
It is compile time error (CTE)
D:\QSPIDER\JAVA\10.05.25 - Class 9\Assignment>javac as14.java
as14.java:6: error: cannot find symbol
                System.out.println(a+b);
                                   ^
  symbol:   variable a
  location: class as14
1 error
*/