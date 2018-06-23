import java.io.*;
import java.util.*;
class Amstrong1 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int c=a;
        int sum=0;
        while(a>0&&a<=10000)
        {
           int b=a%10;
           sum=sum+(b*b*b);
           a=a/10;
        }
        if(c==sum)
        System.out.print("yes");
        else
        System.out.print("no");
    }
}
