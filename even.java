class EvenNumbers
{
    public static void main(String[] args)
    {
        System.out.println("Even numbers between 1 and 50:");

        for (int num = 1; num <= 50; num++)
        {
            if (num % 2 == 0)
            {
                System.out.println(num);
            }
        }
    }
}