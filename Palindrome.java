import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        int r,n,temp,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}