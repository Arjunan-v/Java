class as5
{
	public static void main(String[] args) 
	{
		String name = "Bharath";
		int wallet = 2000;
		int spent = 50;
		System.out.println("Name: "+name);
		System.out.println("Wallet Balance: "+wallet);
		System.out.println("Price of 2kg Branded Lipstick: "+spent);
		wallet = wallet - spent;
		System.out.println("Wallet Balance after purchase: "+wallet);
	}
}
/*
Output:
D:\QSPIDER\JAVA\14.05.25 - Class 12\Assignment>javac as5.java

D:\QSPIDER\JAVA\14.05.25 - Class 12\Assignment>java as5
Name: Bharath
Wallet Balance: 2000
Price of 2kg Branded Lipstick: 50
Wallet Balance after purchase: 1950

D:\QSPIDER\JAVA\14.05.25 - Class 12\Assignment>
*/