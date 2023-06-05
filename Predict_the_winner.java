import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        int a[],s=0,c=0,n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(i%2==0)
            {
                s=a[i]+s;
            }
            else
            c=c+a[i];
        }
        if((s-c)%4==0)
        {
            System.out.println("X");
        }
        else
        System.out.println("Y");
    }
}