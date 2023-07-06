import java.util.*;
class wordfreq {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        str=str+" ";
        int l1=str.length();
        System.out.println("Enter a word");
        String w=sc.nextLine();
        String co="";
        char ch;
        int i,count=0;
        int l=w.length();
        for(i=0;i<l1;i++){
            ch=str.charAt(i);
            if(ch!=' '){
                co=co+ch;
            }
            else{
                if(co.contains(w)==true){
                count++;
               }
               co="";
            }
        }
 
        System.out.println(count);
    }
}