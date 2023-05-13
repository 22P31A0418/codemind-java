import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String Val[]=s.split(":");
        int h,m;
        float a;
        h=Integer.parseInt(Val[0]);
        m=Integer.parseInt(Val[1]);
        a=30*h-((float)11/2)*m;
        a=Math.abs(a);
        if(a>180)
             System.out.println(360-a);
        else
             System.out.println(a);
    }
}