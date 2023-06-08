import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a==1 ||a==2 ||a==3 ||a==4 ||a==5 ||a==6 ||a==8 ||a==9 ||a==10 ||a==12)
        {
            System.out.println("Ugly Number");
        }
        else
        {
            System.out.println("Not Ugly Number");
        }
    }
}