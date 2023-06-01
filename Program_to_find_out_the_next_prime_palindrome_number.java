import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        int n,i,j,z,k,b,s,count;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n+1;i>0;i++)
        {
            s=0;
            for(j=i;j>0;j=j/10)
            {
                b=j%10;
                s=s*10+b;
            }
            if(s==i)
            {
                count=0;
                for(z=1;z<=s;z++)
                {
                    if(s%z==0)
                    count++;
                }
                if(count==2)
                {
                    System.out.println(s);
                    break;
                }
            }
        }
    }
}