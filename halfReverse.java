import java.util.*;
class halfReverse {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String reverse="";
        char ch;
        int i,l;
        l=str.length();
        for(i=0;i<l/2;i++){
            ch=str.charAt(i);
            reverse=ch+reverse;
        }
        for(i=l/2;i<l;i++){
            ch=str.charAt(i);
            reverse=reverse+ch;
        }
        System.out.println(reverse);
    }
}