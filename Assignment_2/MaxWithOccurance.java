public class MaxWithOccurance {
    public static void main(String[] args) {
        int firstnumber=(int)(Math.random()*100);
        int max=firstnumber;
        int count=0;
        int maxcount=0;
        System.out.print(firstnumber);
        for(int i=0;i<9;i++)
        {
            int number=(int)(Math.random()*100);
            System.out.print(" "+number);
            if(number==max)
                count++;
            if(number>max)
            {
                max=number;
                if(count>maxcount)
                    maxcount=count;
                count=0;
            }
            if(count>maxcount)
                maxcount=count;      
        }
        System.out.println("\n Maximum number is "+max+" and number of occurences is "+maxcount);
    }
    
}
