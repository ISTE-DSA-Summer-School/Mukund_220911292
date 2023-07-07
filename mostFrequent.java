import java.util.*;
import java.io.*;
class mostFrequent
{
    static char[] mostFreq(String str)
    {
        int i,j,count=0,st=count;
        char ch;
        int k=0,len=str.length();
        char c[]=new char[26];
        for(i=0;i<len;i++)
        {
            ch=str.charAt(i);
            for(j=0;j<len;j++){
                if(ch==str.charAt(j))
                count++;
            }
            if(count>=st){
                st=count;
            }
            count=0;
        }
        for(i=0;i<len;i++){
            ch=str.charAt(i);
            for(j=i;j<len;j++){
                if(ch==str.charAt(j))
                count++;
            }
            if(count==st){
                c[k]=ch;
                k++;
            }
            count=0;
        }
        return c;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        char c[]=mostFreq(str);
        for(int i=0;i<c.length;i++){
            if(c[i]!=' ')
            System.out.print(c[i]);
        }
        
    }
}