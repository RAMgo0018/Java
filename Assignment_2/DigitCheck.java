package Assignment_2;
class DigitCheck
{
    public static void main(String[] args) 
    {
        int number=(int)(Math.random()*100000);
        System.out.println("Five digit number is "+number);
        int a=(int)(Math.random()*10);
        System.err.println("Number to be searched is "+a);
        int count=0;
        while(number>0)
        {
            int last=number%10;
            if(last==a)
            count++;
            number=number/10;
        }
        if(count==0)
        System.out.println("Number "+a+" is not in "+number);
        else
        System.out.println("Number appears and it appears "+count+" times");
    }
}

