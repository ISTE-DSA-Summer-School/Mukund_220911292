import java.io.*;
import java.util.*;
class calculator{
    public static void main(String ar[])throws Exception{
        char z;
        int x,y;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=(sc.next()).charAt(0);
 
        if(z=='+')
        System.out.println("Result="+(x+y));
        else
        if(z=='-')
        System.out.println("Result="+(x-y));
        else
        if(z=='*')
        System.out.println("Result="+(x*y));
        else
        if(z=='/'&& y!=0)
        System.out.println("Result="+(x/y));
        else
        if(z=='%'&& y!=0)
        System.out.println("Result="+(x%y));
        else
        if(z=='^')
        System.out.println("Result="+(x^y));
    }
}