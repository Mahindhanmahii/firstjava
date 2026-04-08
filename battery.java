class Battery
{ 
  public static void main(String[]args)
  {
	  int battery =90;
	  if(battery>=80)
	  {
		  System.out.println("Battery full");
		  
	  }
	  else if(battery>=30&& battery <=70)
	  {
		  
		  System.out.println("battery normal");
	  }
	  else if (battery<30)
	  {
		  System.out.println("CHARGE NOW");
		  
	  }
	  else {
		  System.out.println("sit quitely");
	  }
	  
	  
  }





}