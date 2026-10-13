class MaxandMin
{
    public static void main(String[] args) {
        int firstnumber=(int)(Math.random()*100);
        int max=firstnumber;
        int min=firstnumber;
        System.out.print(firstnumber);
        for(int i=0;i<9;i++)
        {
            int number=(int)(Math.random()*100);
            System.out.print(" "+number);
            if(number>max)
                max=number;
            if(number<min)
                min=number;
        }
        System.out.println("\n Maximum number is "+ max);
        System.out.println("Minimum number is "+ min);

    }
}