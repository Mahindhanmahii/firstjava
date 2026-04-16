import java.util.Scanner;
class DressShop
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO OUR SHOP");
		System.out.println("1.MEN SECTION");
		System.out.println("2.WOMEMEN SECTION");
		System.out.println("3.KID SECTION");
		System.out.println("3.K");
		
		int model=sc.nextInt();
		if(model==1)
		{
			System.out.println("welcome to mens section");
			System.out.println("1.BAGGY JEANS");
			System.out.println("2.KOREAN TROUSERS");
			System.out.println("3.CARGO JEANS");
			int type=sc.nextInt();
			if(type==1)
			{
				System.out.println("BAGGY JEAN PRICE IS 1000RS:");
			}
			else if(type==2)
			{
				System.out.println("KOREAN TROUSER  PRICE IS 2000RS:");
			}
			else if(type==3)
			{
				System.out.println("CARGO JEAN PRICE IS 4000RS:");
			}
			else 
			{
				System.out.println("WE DONT HAVE ANY DRESS");
				
			}
			
		}
		else if(model==2)
		{
			System.out.println("welcome to mens section");
			System.out.println("1.CHUDI JEANS");
			System.out.println("2.MOM FIT JEAN TROUSERS");
			System.out.println("3.BURQUA JEANS");
			int type=sc.nextInt();
			if(type==1)
			{
				System.out.println("CHUDI PRICE IS 1000RS:");
			}
			else if(type==2)
			{
				System.out.println("MOM FIT JEAN PRICE IS 2000RS:");
			}
			else if(type==3)
			{
				System.out.println("BURQUA PRICE IS 4000RS:");
			}
			else 
			{
				System.out.println("WE DONT HAVE ANY DRESS");
				
			}
		}
			else if(model==3)
		{
			System.out.println("welcome to mens section");
			System.out.println("1.FROK JEANS");
			System.out.println("2.SUIT  TROUSERS");
			System.out.println("3.CARTOON JEANS");
			int type=sc.nextInt();
			if(type==1)
			{
				System.out.println("FROK PRICE IS 500RS:");
			}
			else if(type==2)
			{
				System.out.println("SUIT  PRICE IS 2000RS:");
			}
			else if(type==3)
			{
				System.out.println("CARTOON JEANS PRICE IS 00600RS:");
			}
			else 
			{
				System.out.println("WE DONT HAVE ANY DRESS");
				
			}
		}
			else{
				System.out.println("POOITU VAANGA PONGAL VAALTHUKAL");
			}	
		}			
		
		
		
			
		
		
		
				
		
	}
		

