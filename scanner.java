import java.util.Scanner;
class scanner1 
{
	public static void main(String[]args)
	{
		
		Scanner sc=new Scanner(System.in);
        System.out.print("ENTER YOUR NAME:");
		int num=sc.nextInt();
		if(num>0)
		{
			System.out.println("the given number is positive");
		}
		else if(num<0)
		{
			System.out.println("the given number is negative ");
			
		}
		else
		{
			System.out.println("the number is zero");
		}
		sc.close();
		
		
		
		
		
	}
}
