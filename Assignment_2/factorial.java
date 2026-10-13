package Assignment_2;
class factorial{
    public static void main(String args[]){
        int a;
         a=(int)(Math.random()*100);
         System.out.println("Number is"+a);
         long fact=1;
         for(int i=1;i<=a;i++)
         {
            fact=fact*i;
         }
         System.out.println("Factorial is"+ fact);        
    }
}