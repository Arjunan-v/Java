class glo7
{
	public static void main(String[] args)
	{
		System.out.println(glo6.a);
	}
}

/*
output:
D:\QSPIDER\JAVA\10.05.25 - Class 9\Practice Programs>javac glo6.java

D:\QSPIDER\JAVA\10.05.25 - Class 9\Practice Programs>javac glo7.java
glo7.java:5: error: cannot find symbol
                System.out.println(glo6.a);
                                       ^
  symbol:   variable a
  location: class glo6
1 error

D:\QSPIDER\JAVA\10.05.25 - Class 9\Practice Programs>
*/