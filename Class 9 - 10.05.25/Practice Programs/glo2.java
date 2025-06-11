class glo2
{
	public static void main(String[] args) 
	{
		static int num = 3;
		System.out.println(num);
	}
}

/*
output:

It is CTE

D:\QSPIDER\JAVA\10.05.25 - Class 9\Practice Programs>javac glo2.java
glo2.java:5: error: illegal start of expression
                static int num = 3;
                ^
glo2.java:6: error: <identifier> expected
                System.out.println(num);
                                  ^
glo2.java:6: error: <identifier> expected
                System.out.println(num);
                                      ^
glo2.java:8: error: class, interface, enum, or record expected
}
^
4 errors
*/