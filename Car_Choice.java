import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float X1,X2,Y1,Y2;
        int t;
        t=sc.nextInt();
        while(t-->0)
        {
            X1=sc.nextFloat();
            X2=sc.nextFloat();
            Y1=sc.nextFloat();
            Y2=sc.nextFloat();
            if(Y1/X1<Y2/X2)
               System.out.println("-1");
            else if(Y1/X1>Y2/X2)
               System.out.println("1");
            else
               System.out.println("0");
        }
    }
}