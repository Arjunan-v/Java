import java.util.Scanner;
class as6
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int id=03;
		System.out.println("Choose\n1.View Profile\n2.Edit Profile\n3.Delete Profile");
		int a = sc.nextInt();
		switch(a)
		{
			case 1:
			{
				if (id == 0)
				{
					System.out.println("Profile doesnt exist");
				}
				System.out.println("Profile : ");
				System.out.println("Id : "+id);
				break;
			}
			case 2:
			{
				System.out.print("Enter your new id : ");
				id = sc.nextInt();
				System.out.println("Your new id : "+id);
				System.out.println("Profile Edited");
				break;
			}
			case 3:
			{
				id = 0;
				System.out.println("Profile is deleted");
				break;
			}
			default:
				System.out.println("Invalid choice");
		}
	}
}
/*
Output:
D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as6
Choose
1.View Profile
2.Edit Profile
3.Delete Profile
1
Profile :
Id : 3

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as6
Choose
1.View Profile
2.Edit Profile
3.Delete Profile
2
Enter your new id : 78
Your new id : 78
Profile Edited

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>java as6
Choose
1.View Profile
2.Edit Profile
3.Delete Profile
3
Profile is deleted

D:\QSPIDER\JAVA\23.05.25 - Class 20\Assignment>

*/