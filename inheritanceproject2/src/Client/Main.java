package Client;

import java.util.Scanner;

import Controller.Item;
import Controller.Product;
import Controller.Service;

public class Main {
	public static void main(String[] args) {
		
		int index=0;
		Item[] i=new Item[20];
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.Add Item ");
			System.out.println("2.Search Item by Name");
			System.out.println("3.Display all Products");
			System.out.println("4.Display All services");
			System.out.println("5.Exit");
			System.out.println("______________________________");
			
			System.out.println("Enter Choice: ");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("1.Add Product ");
				System.out.println("2.Add Service");
				System.out.println("_______________________");
				System.out.println("Enter choice:");
				int ch1=sc.nextInt();
				
				   if(ch1==1)
				   {
					   System.out.println("*****Add Product***");
					   System.out.println("Enter Product Code : " );
					   int pcode=sc.nextInt();
					   
					   boolean flag=false;
					   for(Item obj:i)
					   {
						   if(obj instanceof Product)
						   {
							   Product p=(Product) obj;
							   if(p.getProductCode()==pcode)
							   {
								   System.out.println("Product Already Existed ...");
								   System.out.println("________________________________");
								   flag=true;
								   break;
							   }
							   break;
						   }
						   
						   if(!flag)
						   {
							   System.out.println("Enter product Name :");
							   String name=sc.next();
							   
							   System.out.println("Enter Product Price :");
							   double price=sc.nextDouble();
							   
							   i[index++]=new Product (name, price,pcode);
							   System.out.println("Product Added successfully....");
							   System.out.println("____________________________________");
							   break;
						   }
					   }
				   }
				   
				   else
				   {
					   System.out.println("*****Add Service***");
					   System.out.println("Enter Service Code : " );
					   int scode=sc.nextInt();
					   
					   boolean flag1=false;
					   for(Item obj:i)
					   {
						   if(obj instanceof Service)
						   {
							   Service s=(Service) obj;
							   if(s.getServiceCode()==scode)
							   {
								   System.out.println("Service Already Existed ...");
								   System.out.println("________________________________");
								   flag1=true;
								   break;
							   }
							  // break;
						   }
						   
						   if(!flag1)
						   {
							   System.out.println("Enter Service Name :");
							   String name=sc.next();
							   
							   System.out.println("Enter Service Price :");
							   double price=sc.nextDouble();
							   
							   System.out.println("Enter Service Category :");
							   String category=sc.next();
							   
							   i[index++]=new Service(name, price,scode, category);
							   System.out.println("Service Added successfully....");
							   System.out.println("___________________________________");
							   break;
						   }
					   }
				   }
				   
				   
				break;
			case 2:
				boolean flag=false;
				
						System.out.println("Enter Item Name to Search : ");
						String name=sc.next();
						for(Item obj:i)
						{
							if(obj!=null) {
						
						
						if (obj != null && obj.getName() != null && obj.getName().equalsIgnoreCase(name)) {
							
							
							if(obj instanceof Product) {
								Product p=(Product)obj;
								System.out.println("___________Product____________");
								System.out.println("Name :"+p.getName());
								System.out.println("Product Code : "+p.getProductCode());
								System.out.println("Product Price :  "+p.getPrice());
								System.out.println("_____________________________________");
								flag=true;
								break;
								
							}
							
							if(obj instanceof Service) {
								Service s=(Service) obj;
								System.out.println("_______Service__________");
								System.out.println("Name : "+s.getName());
								System.out.println("Price : "+s.getPrice());
								System.out.println("Service Code :"+s.getServiceCode());
								System.out.println("Service Category :"+s.getServiceCategory());
								System.out.println("________________________________");
								flag=true;
								break;
							}
							
							
						if(!flag) {
							System.out.println("Item Not Found..");
						}	
						}
						
						
						
						
					}
				}
				
				break;
			case 3:
				
				System.out.println("****All Products****");
				for(Item obj:i)
				{
					if(obj!=null) {
					if(obj instanceof Product) {
						Product p=(Product)obj;
						{
							System.out.println("Name :"+p.getName());
							System.out.println("Product Code : "+p.getProductCode());
							System.out.println("Product Price :  "+p.getPrice());
                            System.out.println("________________________________");
                            break;
						}
					}
					}
				}
				
				break;
			case 4:
				System.out.println("****All Services****");
				for(Item obj:i)
				{
					if(obj!=null) {
					if(obj instanceof Service) {
						Service s=(Service)obj;
						{
							System.out.println("Name : "+s.getName());
							System.out.println("Price : "+s.getPrice());
							System.out.println("Service Code :"+s.getServiceCode());
							System.out.println("Service Category :"+s.getServiceCategory());
							System.out.println("__________________________________");
							
							break;
						}
					}
					}
				}
				break;
			case 5:
				System.out.println("Exiting.....");
				System.exit(0);
            default:
            	System.out.println("Invalid Input...");
            	break;
			}
		}
		
		
	}

}
