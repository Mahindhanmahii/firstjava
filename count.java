class CountDigits
{
  public static void main(String[] args)
  {
    int number = 987;
    int temp = number;
    int count = 0;

    while(temp != 0)
    {
      temp = temp / 10;
      count++;
    }

    System.out.println("Number = " + number);
    System.out.println("Number of digits = " + count);
  }
}