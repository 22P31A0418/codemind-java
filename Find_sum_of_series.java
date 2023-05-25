import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        float n,i,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextFloat();
        for(i=1;i<=n;i++)
        {
            sum+=(1/i);
        }
        System.out.format("%.2f",sum);
    }
}