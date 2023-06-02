import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        int a,b,i,j,c=0,n,l,t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(l=1;l<=t;l++)
        {
            c=0;
            a=sc.nextInt();
            b=sc.nextInt();
            for(i=a;i<=b;i++)
            {
                n=0;
                n=i%10;
                if(n==2 ||n==3 ||n==9)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}