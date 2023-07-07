import java.util.*;
import java.io.*;
class anagram 
{
    static boolean checkanagram(String s1,String s2){
        int i,j;
        boolean b=false;
        char ch;
        if(s1.length()!=s2.length())
        b=false;
        else{
            for(i=0;i<s1.length();i++){
               ch=s1.charAt(i);
                for(j=0;j<s2.length();j++){
                   if(ch==s2.charAt(j)){
                    b=true;
                    break;
                   }
                   else
                   b=false;
                }
            }
 
        }
        return b;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter string 1");
        s1=sc.nextLine();
        System.out.println("Enter string 2");
        s2=sc.nextLine();
        boolean c=checkanagram(s1,s2);
        System.out.println(c);
    }
}