import java.util.*;
public class Moinika
{
    public static void main(String args[])
    {
        int n,m,a=0,b=1,i,cnt=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<n+1;i++)
        {
            int c;
            c=a+b;
            if(c==n)
            {
                cnt++;
                break;
            }
            a=b;
            b=c;
        }
        if(cnt==0)
        {
            System.out.println("False");
        }
        else
        {
            System.out.println("True");
        }
    }
}