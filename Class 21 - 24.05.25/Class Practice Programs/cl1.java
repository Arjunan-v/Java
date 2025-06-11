import java.util.*;
class cl1
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Swiggy");
		System.out.println("Select the hotel:\n1.Buhari\n2.A2B\n3.Amma Canteen");
		System.out.print("Choose the hotel:");
		int a = sc.nextInt();
		switch(a)
		{
			case 1:
			{
				System.out.println("Welcome to Buhari\nMenu:");
				System.out.println("1:Mutton Briyani - 480Rs\n2.Chicken Briyani - 380Rs\n3.Prawn Briyani - 450Rs");
				System.out.print("Choose the food:");
				int b = sc.nextInt();
				switch(b)
				{
					case 1:
					{
						double per_plate = 480;
						System.out.println("Enter the quantity:");
						int c = sc.nextInt();
						double bill = c *per_plate;
						System.out.println("Total Bill : "+bill);
						System.out.println("Press any key to confirm.\nPress N to cancel the order.");
						char con = sc.next().charAt(0);
						if (con == 'N')
						{
							System.out.println("Order Cancelled.");
							break;
						}
						else
						{
							System.out.println("Payment options:\n1.GPAY\n2.Phonepay.\nSelect the payment mode");
							// To generate otp : math.random()*9999+9999
							int pay = sc.nextInt();
							if (pay == 1)
							{
								System.out.println("GPAY:");
								System.out.print("Enter the bill amount:");
								double bill_con = sc.nextDouble();
								if (bill == bill_con)
								{
									int otp = (int)(Math.random()*9999+9999);//otp
									System.out.println("OTP Generated: "+otp);
									System.out.print("Enter OTP:");
									int otp_user = sc.nextInt();
									if (otp == otp_user)
									{
										System.out.println("Order Confirmed");
									}
									else
									{
										System.out.println("OTP Wrong\nOrder Failed.");
									}
								}
							}
							else if(pay == 2)
							{
								System.out.println("Phonepay:");
								System.out.print("Enter the bill amount:");
								double bill_con = sc.nextDouble();
								if (bill == bill_con)
								{
									int otp = (int)(Math.random()*9999+9999);//otp
									System.out.println("OTP Generated: "+otp);
									System.out.print("Enter OTP:");
									int otp_user = sc.nextInt();
									if (otp == otp_user)
									{
										System.out.println("Order Confirmed");
									}
									else
									{
										System.out.println("OTP Wrong\nOrder Failed.");
									}
								}
							}
							else
							{
								System.out.println("Invalid Payment Option");
							}

						}
						break;
					}
					case 2:
					{
						double per_plate = 380;
						System.out.println("Enter the quantity:");
						int c = sc.nextInt();
						double bill = c *per_plate;
						System.out.println("Total Bill : "+bill);
						System.out.println("Press any key to confirm.\nPress N to cancel the order.");
						char con = sc.next().charAt(0);
						if (con == 'N')
						{
							System.out.println("Order Cancelled.");
							break;
						}
						else
						{
							System.out.println("Payment options:\n1.GPAY\n2.Phonepay.\nSelect the payment mode");
							// To generate otp : math.random()*9999+9999
							int pay = sc.nextInt();
							if (pay == 1)
							{
								System.out.println("GPAY:");
								System.out.print("Enter the bill amount:");
								double bill_con = sc.nextDouble();
								if (bill == bill_con)
								{
									int otp = (int)(Math.random()*9999+9999);//otp
									System.out.println("OTP Generated: "+otp);
									System.out.print("Enter OTP:");
									int otp_user = sc.nextInt();
									if (otp == otp_user)
									{
										System.out.println("Order Confirmed");
									}
									else
									{
										System.out.println("OTP Wrong\nOrder Failed.");
									}
								}
							}
							else if(pay == 2)
							{
								System.out.println("Phonepay:");
								System.out.print("Enter the bill amount:");
								double bill_con = sc.nextDouble();
								if (bill == bill_con)
								{
									int otp = (int)(Math.random()*9999+9999);//otp
									System.out.println("OTP Generated: "+otp);
									System.out.print("Enter OTP:");
									int otp_user = sc.nextInt();
									if (otp == otp_user)
									{
										System.out.println("Order Confirmed");
									}
									else
									{
										System.out.println("OTP Wrong\nOrder Failed.");
									}
								}
							}
							else
							{
								System.out.println("Invalid Payment Option");
							}

						}
						break;
					}
					case 3:
					{
						double per_plate = 450;
						System.out.println("Enter the quantity:");
						int c = sc.nextInt();
						double bill = c *per_plate;
						System.out.println("Total Bill : "+bill);
						System.out.println("Press any key to confirm.\nPress N to cancel the order.");
						char con = sc.next().charAt(0);
						if (con == 'N')
						{
							System.out.println("Order Cancelled.");
							break;
						}
						else
						{
							System.out.println("Payment options:\n1.GPAY\n2.Phonepay.\nSelect the payment mode");
							// To generate otp : math.random()*9999+9999
							int pay = sc.nextInt();
							if (pay == 1)
							{
								System.out.println("GPAY:");
								System.out.print("Enter the bill amount:");
								double bill_con = sc.nextDouble();
								if (bill == bill_con)
								{
									int otp = (int)(Math.random()*9999+9999);//otp
									System.out.println("OTP Generated: "+otp);
									System.out.print("Enter OTP:");
									int otp_user = sc.nextInt();
									if (otp == otp_user)
									{
										System.out.println("Order Confirmed");
									}
									else
									{
										System.out.println("OTP Wrong\nOrder Failed.");
									}
								}
							}
							else if(pay == 2)
							{
								System.out.println("Phonepay:");
								System.out.print("Enter the bill amount:");
								double bill_con = sc.nextDouble();
								if (bill == bill_con)
								{
									int otp = (int)(Math.random()*9999+9999);//otp
									System.out.println("OTP Generated: "+otp);
									System.out.print("Enter OTP:");
									int otp_user = sc.nextInt();
									if (otp == otp_user)
									{
										System.out.println("Order Confirmed");
									}
									else
									{
										System.out.println("OTP Wrong\nOrder Failed.");
									}
								}
							}
							else
							{
								System.out.println("Invalid Payment Option");
							}

						}
						break;
					}
					default:
					{
						System.out.println("Invalid Choice.");
						break;
					}
					
				}
				break;
			}
			case 2:
			{
				System.out.println("Welcome to A2B\nMenu:");
				System.out.println("1:Mushroom Briyani - 250Rs\n2.Paneer Briyani - 300Rs\n3.Gobi Briyani - 200Rs");
				System.out.print("Choose the food:");
				int b = sc.nextInt();
				switch(b)
				{
					case 1:
					{
						double per_plate = 250;
						System.out.println("Enter the quantity:");
						int c = sc.nextInt();
						double bill = c *per_plate;
						System.out.println("Total Bill : "+bill);
						System.out.println("Press any key to confirm.\nPress N to cancel the order.");
						char con = sc.next().charAt(0);
						if (con == 'N')
						{
							System.out.println("Order Cancelled.");
							break;
						}
						else
						{
							System.out.println("Payment options:\n1.GPAY\n2.Phonepay.\nSelect the payment mode");
							// To generate otp : math.random()*9999+9999
							int pay = sc.nextInt();
							if (pay == 1)
							{
								System.out.println("GPAY:");
								System.out.print("Enter the bill amount:");
								double bill_con = sc.nextDouble();
								if (bill == bill_con)
								{
									int otp = (int)(Math.random()*9999+9999);//otp
									System.out.println("OTP Generated: "+otp);
									System.out.print("Enter OTP:");
									int otp_user = sc.nextInt();
									if (otp == otp_user)
									{
										System.out.println("Order Confirmed");
									}
									else
									{
										System.out.println("OTP Wrong\nOrder Failed.");
									}
								}
							}
							else if(pay == 2)
							{
								System.out.println("Phonepay:");
								System.out.print("Enter the bill amount:");
								double bill_con = sc.nextDouble();
								if (bill == bill_con)
								{
									int otp = (int)(Math.random()*9999+9999);//otp
									System.out.println("OTP Generated: "+otp);
									System.out.print("Enter OTP:");
									int otp_user = sc.nextInt();
									if (otp == otp_user)
									{
										System.out.println("Order Confirmed");
									}
									else
									{
										System.out.println("OTP Wrong\nOrder Failed.");
									}
								}
							}
							else
							{
								System.out.println("Invalid Payment Option");
							}

						}
						break;
					}
					case 2:
					{
						double per_plate = 300;
						System.out.println("Enter the quantity:");
						int c = sc.nextInt();
						double bill = c *per_plate;
						System.out.println("Total Bill : "+bill);
						System.out.println("Press any key to confirm.\nPress N to cancel the order.");
						char con = sc.next().charAt(0);
						if (con == 'N')
						{
							System.out.println("Order Cancelled.");
							break;
						}
						else
						{
							System.out.println("Payment options:\n1.GPAY\n2.Phonepay.\nSelect the payment mode");
							// To generate otp : math.random()*9999+9999
							int pay = sc.nextInt();
							if (pay == 1)
							{
								System.out.println("GPAY:");
								System.out.print("Enter the bill amount:");
								double bill_con = sc.nextDouble();
								if (bill == bill_con)
								{
									int otp = (int)(Math.random()*9999+9999);//otp
									System.out.println("OTP Generated: "+otp);
									System.out.print("Enter OTP:");
									int otp_user = sc.nextInt();
									if (otp == otp_user)
									{
										System.out.println("Order Confirmed");
									}
									else
									{
										System.out.println("OTP Wrong\nOrder Failed.");
									}
								}
							}
							else if(pay == 2)
							{
								System.out.println("Phonepay:");
								System.out.print("Enter the bill amount:");
								double bill_con = sc.nextDouble();
								if (bill == bill_con)
								{
									int otp = (int)(Math.random()*9999+9999);//otp
									System.out.println("OTP Generated: "+otp);
									System.out.print("Enter OTP:");
									int otp_user = sc.nextInt();
									if (otp == otp_user)
									{
										System.out.println("Order Confirmed");
									}
									else
									{
										System.out.println("OTP Wrong\nOrder Failed.");
									}
								}
							}
							else
							{
								System.out.println("Invalid Payment Option");
							}

						}
						break;
					}
					case 3:
					{
						double per_plate = 200;
						System.out.println("Enter the quantity:");
						int c = sc.nextInt();
						double bill = c *per_plate;
						System.out.println("Total Bill : "+bill);
						System.out.println("Press any key to confirm.\nPress N to cancel the order.");
						char con = sc.next().charAt(0);
						if (con == 'N')
						{
							System.out.println("Order Cancelled.");
							break;
						}
						else
						{
							System.out.println("Payment options:\n1.GPAY\n2.Phonepay.\nSelect the payment mode");
							// To generate otp : math.random()*9999+9999
							int pay = sc.nextInt();
							if (pay == 1)
							{
								System.out.println("GPAY:");
								System.out.print("Enter the bill amount:");
								double bill_con = sc.nextDouble();
								if (bill == bill_con)
								{
									int otp = (int)(Math.random()*9999+9999);//otp
									System.out.println("OTP Generated: "+otp);
									System.out.print("Enter OTP:");
									int otp_user = sc.nextInt();
									if (otp == otp_user)
									{
										System.out.println("Order Confirmed");
									}
									else
									{
										System.out.println("OTP Wrong\nOrder Failed.");
									}
								}
							}
							else if(pay == 2)
							{
								System.out.println("Phonepay:");
								System.out.print("Enter the bill amount:");
								double bill_con = sc.nextDouble();
								if (bill == bill_con)
								{
									int otp = (int)(Math.random()*9999+9999);//otp
									System.out.println("OTP Generated: "+otp);
									System.out.print("Enter OTP:");
									int otp_user = sc.nextInt();
									if (otp == otp_user)
									{
										System.out.println("Order Confirmed");
									}
									else
									{
										System.out.println("OTP Wrong\nOrder Failed.");
									}
								}
							}
							else
							{
								System.out.println("Invalid Payment Option");
							}

						}
						break;
					}
					default:
					{
						System.out.println("Invalid Choice.");
						break;
					}
					
				}
				break;
			}
			case 3:
			{
				System.out.println("Welcome to Amma Canteen\nMenu:");
				System.out.println("1:Dosa - 30Rs\n2.Idly - 20Rs\n3.Pongal - 25Rs");
				System.out.print("Choose the food:");
				int b = sc.nextInt();
				switch(b)
				{
					case 1:
					{
						double per_plate = 30;
						System.out.println("Enter the quantity:");
						int c = sc.nextInt();
						double bill = c *per_plate;
						System.out.println("Total Bill : "+bill);
						System.out.println("Press any key to confirm.\nPress N to cancel the order.");
						char con = sc.next().charAt(0);
						if (con == 'N')
						{
							System.out.println("Order Cancelled.");
							break;
						}
						else
						{
							System.out.println("Payment options:\n1.GPAY\n2.Phonepay.\nSelect the payment mode");
							// To generate otp : math.random()*9999+9999
							int pay = sc.nextInt();
							if (pay == 1)
							{
								System.out.println("GPAY:");
								System.out.print("Enter the bill amount:");
								double bill_con = sc.nextDouble();
								if (bill == bill_con)
								{
									int otp = (int)(Math.random()*9999+9999);//otp
									System.out.println("OTP Generated: "+otp);
									System.out.print("Enter OTP:");
									int otp_user = sc.nextInt();
									if (otp == otp_user)
									{
										System.out.println("Order Confirmed");
									}
									else
									{
										System.out.println("OTP Wrong\nOrder Failed.");
									}
								}
							}
							else if(pay == 2)
							{
								System.out.println("Phonepay:");
								System.out.print("Enter the bill amount:");
								double bill_con = sc.nextDouble();
								if (bill == bill_con)
								{
									int otp = (int)(Math.random()*9999+9999);//otp
									System.out.println("OTP Generated: "+otp);
									System.out.print("Enter OTP:");
									int otp_user = sc.nextInt();
									if (otp == otp_user)
									{
										System.out.println("Order Confirmed");
									}
									else
									{
										System.out.println("OTP Wrong\nOrder Failed.");
									}
								}
							}
							else
							{
								System.out.println("Invalid Payment Option");
							}

						}
						break;
					}
					case 2:
					{
						double per_plate = 20;
						System.out.println("Enter the quantity:");
						int c = sc.nextInt();
						double bill = c *per_plate;
						System.out.println("Total Bill : "+bill);
						System.out.println("Press any key to confirm.\nPress N to cancel the order.");
						char con = sc.next().charAt(0);
						if (con == 'N')
						{
							System.out.println("Order Cancelled.");
							break;
						}
						else
						{
							System.out.println("Payment options:\n1.GPAY\n2.Phonepay.\nSelect the payment mode");
							// To generate otp : math.random()*9999+9999
							int pay = sc.nextInt();
							if (pay == 1)
							{
								System.out.println("GPAY:");
								System.out.print("Enter the bill amount:");
								double bill_con = sc.nextDouble();
								if (bill == bill_con)
								{
									int otp = (int)(Math.random()*9999+9999);//otp
									System.out.println("OTP Generated: "+otp);
									System.out.print("Enter OTP:");
									int otp_user = sc.nextInt();
									if (otp == otp_user)
									{
										System.out.println("Order Confirmed");
									}
									else
									{
										System.out.println("OTP Wrong\nOrder Failed.");
									}
								}
							}
							else if(pay == 2)
							{
								System.out.println("Phonepay:");
								System.out.print("Enter the bill amount:");
								double bill_con = sc.nextDouble();
								if (bill == bill_con)
								{
									int otp = (int)(Math.random()*9999+9999);//otp
									System.out.println("OTP Generated: "+otp);
									System.out.print("Enter OTP:");
									int otp_user = sc.nextInt();
									if (otp == otp_user)
									{
										System.out.println("Order Confirmed");
									}
									else
									{
										System.out.println("OTP Wrong\nOrder Failed.");
									}
								}
							}
							else
							{
								System.out.println("Invalid Payment Option");
							}

						}
						break;
					}
					case 3:
					{
						double per_plate = 25;
						System.out.println("Enter the quantity:");
						int c = sc.nextInt();
						double bill = c *per_plate;
						System.out.println("Total Bill : "+bill);
						System.out.println("Press any key to confirm.\nPress N to cancel the order.");
						char con = sc.next().charAt(0);
						if (con == 'N')
						{
							System.out.println("Order Cancelled.");
							break;
						}
						else
						{
							System.out.println("Payment options:\n1.GPAY\n2.Phonepay.\nSelect the payment mode");
							// To generate otp : math.random()*9999+9999
							int pay = sc.nextInt();
							if (pay == 1)
							{
								System.out.println("GPAY:");
								System.out.print("Enter the bill amount:");
								double bill_con = sc.nextDouble();
								if (bill == bill_con)
								{
									int otp = (int)(Math.random()*9999+9999);//otp
									System.out.println("OTP Generated: "+otp);
									System.out.print("Enter OTP:");
									int otp_user = sc.nextInt();
									if (otp == otp_user)
									{
										System.out.println("Order Confirmed");
									}
									else
									{
										System.out.println("OTP Wrong\nOrder Failed.");
									}
								}
							}
							else if(pay == 2)
							{
								System.out.println("Phonepay:");
								System.out.print("Enter the bill amount:");
								double bill_con = sc.nextDouble();
								if (bill == bill_con)
								{
									int otp = (int)(Math.random()*9999+9999);//otp
									System.out.println("OTP Generated: "+otp);
									System.out.print("Enter OTP:");
									int otp_user = sc.nextInt();
									if (otp == otp_user)
									{
										System.out.println("Order Confirmed");
									}
									else
									{
										System.out.println("OTP Wrong\nOrder Failed.");
									}
								}
							}
							else
							{
								System.out.println("Invalid Payment Option");
							}

						}
						break;
					}
					default:
					{
						System.out.println("Invalid Choice.");
						break;
					}
					
				}
				break;
			}
			default:
			{
				System.out.println("Invalid");
				break;
			}
		
		}
				
		System.out.println("Swiggy Application Exited");
	}
}
/*
Output:
D:\QSPIDER\JAVA\24.05.25 - Class 21\Class Practice Programs>java cl1
Welcome to Swiggy
Select the hotel:
1.Buhari
2.A2B
3.Amma Canteen
Choose the hotel:1
Welcome to Buhari
Menu:
1:Mutton Briyani - 480Rs
2.Chicken Briyani - 380Rs
3.Prawn Briyani - 450Rs
Choose the food:1
Enter the quantity:
2
Total Bill : 960.0
Press any key to confirm.
Press N to cancel the order.
y
Payment options:
1.GPAY
2.Phonepay.
Select the payment mode
1
GPAY:
Enter the bill amount:960
OTP Generated: 19800
Enter OTP:19800
Order Confirmed
Swiggy Application Exited

D:\QSPIDER\JAVA\24.05.25 - Class 21\Class Practice Programs>java cl1
Welcome to Swiggy
Select the hotel:
1.Buhari
2.A2B
3.Amma Canteen
Choose the hotel:1
Welcome to Buhari
Menu:
1:Mutton Briyani - 480Rs
2.Chicken Briyani - 380Rs
3.Prawn Briyani - 450Rs
Choose the food:2
Enter the quantity:
3
Total Bill : 1140.0
Press any key to confirm.
Press N to cancel the order.
y
Payment options:
1.GPAY
2.Phonepay.
Select the payment mode
2
Phonepay:
Enter the bill amount:1140
OTP Generated: 19494
Enter OTP:19494
Order Confirmed
Swiggy Application Exited

D:\QSPIDER\JAVA\24.05.25 - Class 21\Class Practice Programs>java cl1
Welcome to Swiggy
Select the hotel:
1.Buhari
2.A2B
3.Amma Canteen
Choose the hotel:1
Welcome to Buhari
Menu:
1:Mutton Briyani - 480Rs
2.Chicken Briyani - 380Rs
3.Prawn Briyani - 450Rs
Choose the food:3
Enter the quantity:
4
Total Bill : 1800.0
Press any key to confirm.
Press N to cancel the order.
y
Payment options:
1.GPAY
2.Phonepay.
Select the payment mode
1
GPAY:
Enter the bill amount:1800
OTP Generated: 11298
Enter OTP:11298
Order Confirmed
Swiggy Application Exited

D:\QSPIDER\JAVA\24.05.25 - Class 21\Class Practice Programs>java cl1
Welcome to Swiggy
Select the hotel:
1.Buhari
2.A2B
3.Amma Canteen
Choose the hotel:2
Welcome to A2B
Menu:
1:Mushroom Briyani - 250Rs
2.Paneer Briyani - 300Rs
3.Gobi Briyani - 200Rs
Choose the food:1
Enter the quantity:
2
Total Bill : 500.0
Press any key to confirm.
Press N to cancel the order.
y
Payment options:
1.GPAY
2.Phonepay.
Select the payment mode
1
GPAY:
Enter the bill amount:500
OTP Generated: 14925
Enter OTP:14925
Order Confirmed
Swiggy Application Exited

D:\QSPIDER\JAVA\24.05.25 - Class 21\Class Practice Programs>java cl1
Welcome to Swiggy
Select the hotel:
1.Buhari
2.A2B
3.Amma Canteen
Choose the hotel:2
Welcome to A2B
Menu:
1:Mushroom Briyani - 250Rs
2.Paneer Briyani - 300Rs
3.Gobi Briyani - 200Rs
Choose the food:2
Enter the quantity:
3
Total Bill : 900.0
Press any key to confirm.
Press N to cancel the order.
y
Payment options:
1.GPAY
2.Phonepay.
Select the payment mode
2
Phonepay:
Enter the bill amount:900
OTP Generated: 11049
Enter OTP:11049
Order Confirmed
Swiggy Application Exited

D:\QSPIDER\JAVA\24.05.25 - Class 21\Class Practice Programs>java cl1
Welcome to Swiggy
Select the hotel:
1.Buhari
2.A2B
3.Amma Canteen
Choose the hotel:2
Welcome to A2B
Menu:
1:Mushroom Briyani - 250Rs
2.Paneer Briyani - 300Rs
3.Gobi Briyani - 200Rs
Choose the food:3
Enter the quantity:
4
Total Bill : 800.0
Press any key to confirm.
Press N to cancel the order.
y
Payment options:
1.GPAY
2.Phonepay.
Select the payment mode
1
GPAY:
Enter the bill amount:800
OTP Generated: 18973
Enter OTP:18973
Order Confirmed
Swiggy Application Exited

D:\QSPIDER\JAVA\24.05.25 - Class 21\Class Practice Programs>java cl1
Welcome to Swiggy
Select the hotel:
1.Buhari
2.A2B
3.Amma Canteen
Choose the hotel:3
Welcome to Amma Canteen
Menu:
1:Dosa - 30Rs
2.Idly - 20Rs
3.Pongal - 25Rs
Choose the food:1
Enter the quantity:
5
Total Bill : 150.0
Press any key to confirm.
Press N to cancel the order.
y
Payment options:
1.GPAY
2.Phonepay.
Select the payment mode
1
GPAY:
Enter the bill amount:150
OTP Generated: 10980
Enter OTP:10980
Order Confirmed
Swiggy Application Exited

D:\QSPIDER\JAVA\24.05.25 - Class 21\Class Practice Programs>java cl1
Welcome to Swiggy
Select the hotel:
1.Buhari
2.A2B
3.Amma Canteen
Choose the hotel:3
Welcome to Amma Canteen
Menu:
1:Dosa - 30Rs
2.Idly - 20Rs
3.Pongal - 25Rs
Choose the food:2
Enter the quantity:
6
Total Bill : 120.0
Press any key to confirm.
Press N to cancel the order.
y
Payment options:
1.GPAY
2.Phonepay.
Select the payment mode
2
Phonepay:
Enter the bill amount:120
OTP Generated: 12828
Enter OTP:12828
Order Confirmed
Swiggy Application Exited

D:\QSPIDER\JAVA\24.05.25 - Class 21\Class Practice Programs>java cl1
Welcome to Swiggy
Select the hotel:
1.Buhari
2.A2B
3.Amma Canteen
Choose the hotel:3
Welcome to Amma Canteen
Menu:
1:Dosa - 30Rs
2.Idly - 20Rs
3.Pongal - 25Rs
Choose the food:3
Enter the quantity:
7
Total Bill : 175.0
Press any key to confirm.
Press N to cancel the order.
y
Payment options:
1.GPAY
2.Phonepay.
Select the payment mode
1
GPAY:
Enter the bill amount:175
OTP Generated: 13510
Enter OTP:13510
Order Confirmed
Swiggy Application Exited

D:\QSPIDER\JAVA\24.05.25 - Class 21\Class Practice Programs>
*/