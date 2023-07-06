import java.util.*;
import java.io.*;
class inbuilt 
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println("String length:"+str.length());
        System.out.println("First Character:"+str.charAt(0);
        System.out.println("Index of a:"+str.indexOf('a'));
        System.out.println("adding hello to string:"+str.concat("HELLO"));
        System.out.println("First word:"+str.substring(0,str.indexOf(" ")));
    }
}