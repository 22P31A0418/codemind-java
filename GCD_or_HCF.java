import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        int a,b,min;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        min=(a>b)?a:b;
        for(min=min;min>0;min--)
        {
            if(a%min==0 && b%min==0)
            {
                System.out.println(min);
                break;
            }
        }
    }
}