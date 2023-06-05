import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        int a[],b,c,n,k=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            if(a[i]<a[i+1])
            {
                k=k+(a[i+1]-a[i]);
            }
        }
        System.out.println(k);
    }
}