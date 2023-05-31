import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        int n,i,b,max=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n;i>0;i=i/10)
        {
            b=i%10;
            if(b>max)
            max=b;
        }
        System.out.println(max);
    }
}