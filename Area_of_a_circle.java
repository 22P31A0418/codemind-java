import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r;
        double pi=3.14,n;
        r=sc.nextInt();
        n=pi*r*r;
        System.out.format("%.2f",n);
    }
}