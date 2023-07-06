import java.io.*;
import java.util.*;
class arrayrev
{
    public static void main(String ar[])throws Exception
    {
    	Scanner sc=new Scanner(System.in);
    	int l,x,st;
        //Taking the length of array from the user
        l=sc.nextInt();
        int arr[]=new int[l];
        //Taking the value of array from the user
 
        for(x=0;x<l;x++)
        arr[x]=sc.nextInt();
 
        System.out.println("Original Array");
        for(x=0;x<l;x++)
        System.out.print(arr[x]+" ");
 
        for(x=0;x<(l/2);x++)
        {
        	st=arr[x];
        	arr[x]=arr[l-1-x];
        	arr[l-1-x]=st;
        }
 
     System.out.println("\nNew Array");
        for(x=0;x<l;x++)
        System.out.print(arr[x]+" ");
 
    }
}