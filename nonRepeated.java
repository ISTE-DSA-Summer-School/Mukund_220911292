import java.util.*;
import java.io.*;
class nonRepeated
{
    static char nonRepeat(String str)
    {
        int i,j,check=0;
        char ch=' ';
        for(i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                check=0;
                break;
            }
            else
            check++;
        }
        return ch;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        char ch=nonRepeat(str);
        System.out.println(ch);
    }
}