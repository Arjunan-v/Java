class swapnotemp
{
	public static void main(String[] args) 
	{
		int a=10,b=20;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping without temp");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}

/*
Output:
D:\QSPIDER\JAVA\15.05.25 - Class 13\Assignment>javac swapnotemp.java

D:\QSPIDER\JAVA\15.05.25 - Class 13\Assignment>java swapnotemp
a: 10
b: 20
After Swapping without temp
a: 20
b: 10

D:\QSPIDER\JAVA\15.05.25 - Class 13\Assignment>
*/