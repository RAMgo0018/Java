package Assignment_2;
class SumOfDigits 
{
    public static void main(String[] args) 
    {
        int number=(int)(Math.random()*100000);
        System.out.println("Five digit number is"+number);
        int sum=0;
        while(number>0)
        {
            int last=number%10;
            sum+=last;
            number=number/10;
        }
        System.out.println("Sum of digits is"+sum);
    }
}
