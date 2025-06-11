class Esc6
{
	public static void main(String[] args) 
	{
		System.out.println("\"This one with double quotes\"");
		System.out.println("This one with\ttab space");
		System.out.println("This one with\nnext line");
		System.out.println("This one deletes the letter\b before : r should be missing in letter");
		System.out.println("This one returns and replaces the text at the first : \rHello");
		System.out.println("This is a form feed back text : \f After the form character");
	}
}
/*
Output:
D:\QSPIDER\JAVA\07.05.25 - Class 6\Assignments>javac Esc6.java

D:\QSPIDER\JAVA\07.05.25 - Class 6\Assignments>java Esc6
"This one with double quotes"
This one with   tab space
This one with
next line
This one deletes the lette before : r should be missing in letter
Helloone returns and replaces the text at the first :
This is a form feed back text :
                                 After the form character

D:\QSPIDER\JAVA\07.05.25 - Class 6\Assignments>
*/