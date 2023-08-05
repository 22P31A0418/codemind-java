import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        int i,n;
        int c=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[];
        arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>=n)
            {
                System.out.println("NO");
                c=0;
                break;
            }
        }
        if(c==1)
        System.out.println("YES");
    }
}