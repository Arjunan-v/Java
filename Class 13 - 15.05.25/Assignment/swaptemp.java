class swaptemp
{
	public static void main(String[] args) 
	{
		int a=10,b=20,temp;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}

/*
Output:
D:\QSPIDER\JAVA\15.05.25 - Class 13\Assignment>javac swaptemp.java

D:\QSPIDER\JAVA\15.05.25 - Class 13\Assignment>java swaptemp
a: 10
b: 20
After Swapping
a: 20
b: 10

D:\QSPIDER\JAVA\15.05.25 - Class 13\Assignment>
*/