import java.util.*;
class pallindreome {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String reverse="";
        char ch;
        int x;
        for(x=0;x<str.length();x++){
            ch=str.charAt(x);
            reverse=ch+reverse;
        }
        if(str.compareTo(reverse)==0)
        System.out.println("Pallindrome");
        else
        System.out.println("Not Pallindrome");
    }
}