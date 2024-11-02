import java.util.*;
class solution
{
    public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            
            System.out.println("enter two numbers");
            ;int a=sc.nextInt();
            int b=sc.nextInt();
            sum(a,b);
            sc.close();
        }
        public static void sum(int x,int y)
        {
            int total=x+y;
            System.out.println("Sum of two numbers a & b: "+total);
        }
}
