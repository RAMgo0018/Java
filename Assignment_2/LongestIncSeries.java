package Assignment_2;
public class LongestIncSeries {
    public static void main(String[] args) {
        int prev=(int)(Math.random()*100);
        int maxlength=1;
        int length=1;
        System.out.print(prev);
        for(int i=0;i<9;i++)
        {
            int number=(int)(Math.random()*100);
            System.out.print(" "+number);
            if(number>prev)
            {
                length++;
                if(length>maxlength)
                    maxlength=length;
            }
            if(number<=prev)
            {
                length=1;
            }
            prev=number;
            if(length>maxlength)
                maxlength=length;
        }
        System.out.println("\n Length of longest Incrasing series is  "+maxlength);
    }
}
