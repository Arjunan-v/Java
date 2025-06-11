class as13
{
	static String a = "Venkateshwaran ";

	public static void update()
	{
		a = "Arjunan";
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
		update();
		System.out.println(a);
	}
}
/*
output:
D:\QSPIDER\JAVA\10.05.25 - Class 9\Assignment>javac as13.java

D:\QSPIDER\JAVA\10.05.25 - Class 9\Assignment>java as13
Venkateshwaran
Arjunan
*/