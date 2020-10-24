package com.bridgelabz;

import java.util.Scanner;
import java.util.ArrayList;

public class AddressBook {

	private String Name;
	private int Number;
	private String City;
	private String Address;
	private int Zip;
	public void Details(String name, int number, String city, String address, int zip )
	{
		this.Name=name;
		this.Number=number;
		this.City=city;
		this.Address=address;
		this.Zip=zip;
	}
	public void setName(String name)
	{
		this.Name = name;
	}
	public String getName()
	{
		return Name;
	}

	public void setNumber(int number)
	{
		this.Number = number;
	}
	public int getNumber()
	{
		return 	Number;
	}

	public void setCity(String city)
	{
		this.City = city;
	}
	public String getCity()
	{
		return City;
	}

	public void setAddress(String Address)
	{
		this.Address = Address;
	}
	public String getAddress()
	{
		return Address;
	}

	public void setZip(int Zip)
	{
		this.Zip = Zip;
	}
	public int getZip()
	{
		return Zip;
	}
static ArrayList<AddressBook> nums=new ArrayList<AddressBook>();
		
		public static void Insert()
		{
			Scanner sc = new Scanner(System.in);
		    char ans;
		    int num;
		    do
		    {
				System.out.println("The no.of address that you would like to include:");
				num = sc.nextInt();
				AddressBook[] per = new AddressBook[num];
				for (int i = 0 ; i < per.length; i++)
				{
					per[i]=new AddressBook();
					System.out.println("your id is: " + (i+1));
					
					System.out.print("\nEnter Name of Person: \n");
		            per[i].setName(sc.next());
	
		            System.out.print("\nEnter Contact Number of Person:\n ");
		            per[i].setNumber(sc.nextInt());
	
		            System.out.print("\nEnter City: \n");
		            per[i].setCity(sc.next());
	
		            System.out.print("\nEnter Address of Person: \n");
		            per[i].setAddress(sc.next());
	
		            System.out.print("\nEnter Zipcode:\n ");
		            per[i].setZip(sc.nextInt());
	
		            nums.add(per[i]);
				}
				 System.out.print("Would you like to Continue (y/n)? ");
			        String answer = sc.next();
			        ans = answer.charAt(0);
		    }while (ans == 'y');
		    menu();
		}
		    public static void Edit() {
				Scanner sc = new Scanner(System.in);
				String idnum = new String();    
			    System.out.print(" Enter Name Go for Modification : ");
			    idnum = sc.nextLine();
			    	for(AddressBook per:nums)
			    	{
			    		if(per.getName().equals(idnum) )
			    		{
			    			
			    			System.out.print("Is there any changes required for a previous name..Update Now!!:\n ");
			    			per.setName(sc.next());
			    			
			    			System.out.print("Enter Contact Number of Person:\n ");
			    			per.setNumber(sc.nextInt());

			    			System.out.print("\nEnter City: \n");
			    			per.setCity(sc.next());

			    			System.out.print("\nEnter Address of Person: \n");
			    			per.setAddress(sc.next());

			    			System.out.print("\nEnter Zipcode:\n ");
			    			per.setZip(sc.nextInt());
			    		}  		
			    	}
			    
			    menu();
		    }
		    public static void Delete() {
				Scanner sc = new Scanner(System.in);
				String num = new String();    
			    System.out.print("Enter Person Name .. ");
			    num = sc.nextLine();
			    for(int j = 0; j < nums.size(); j++)
			    {
			       if(nums.get(j).getName().equals(num))
			       {
			          nums.remove(j);
			          break;
			       }	    	   
			    }
			    System.out.println("Deleted");
			    Display();
				menu();
		    }
		    public static void Display() {
				Scanner sc = new Scanner(System.in);
				
				if(nums.size() == 0)
			    {
			        System.out.print("EMPTY PLEASE INPUT FIRST\n");
			        sc.nextLine();
			    }
			    else
			    {
			    	 for (AddressBook s : nums) 
			         {
			             System.out.print("\nName :"+s.getName()+"\nNumber :"+s.getNumber()+"\nCity :"+s.getCity()+"\nAddress :"+s.getAddress()+"\nZipCode :"+s.getZip() + "\n");
			         }			         
			    }
				menu();
			}
		    public static void main(String[]args) {
				menu();
			}
			public static void menu() 
			{
				
				    Scanner sc=new Scanner(System.in);
					System.out.println("-----------------MENU---------------------");
					System.out.println("Enter (1) to Insert (2) to Edit (3) to Delete (4) to Display (5) to exit");
					System.out.println("Enter your choice");
					int cho =sc.nextInt();
					switch(cho)
					{
					case 1:
						System.out.println("Insert");
						Insert();
						break;
					case 2:
						System.out.println("Edit/Update");
						Edit();
						break;
					case 3:
						System.out.println("Delete");
						Delete();
						break;
					case 4:
						System.out.println("Display");
						Display();
						break;
					default:
						System.exit(0);
					}	
				}
	}


