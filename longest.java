import java.util.*;
import java..io.*;
class longest {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        str=str+" ";
        String w="";
        char ch;
        int i,count=0;
        int l;
        for(i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch!=' '){
                w=w+ch;
            }
            else{
                l=w.length();
                if(l>count){
                count=l;
               }
               w="";
            }
        }
        
        System.out.println(count);
    }
}