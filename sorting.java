import java.io.*;
import java.util.*;
class sorting{
    public static void main(String ar[])throws Exception{
    	Scanner sc=new Scanner(System.in);
    	int l,x,temp;
    	int i,j;
        //Taking the length of array from the user
        l=sc.nextInt();
        int arr[]=new int[l];
        //Taking the value of array from the user
 
        for(x=0;x<l;x++)
        arr[x]=sc.nextInt();
 
        System.out.println("Original Array");
        for(x=0;x<l;x++)
        System.out.print(arr[x]+" ");
 
       //BUBBLE SORT
       for(i=0; i < l; i++){  
            for(j=1; j < (l-i); j++){  
                if(arr[j-1] > arr[j]){  
                     temp = arr[j-1];  
                     arr[j-1] = arr[j];  
                     arr[j] = temp;  
                         }  
            }
       }
 
       //SELECTION SORT
        for (i = 0; i < l-1; i++) {
            int k = i;
            for (j = i+1; j < l; j++)
                if (arr[j] < arr[k])
                    k = j;
             temp = arr[k];
            arr[k] = arr[i];
            arr[i] = temp;
        }
 
        //INSERTION SORT
        for (i = 1; i < l; ++i) {
            int key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
 
 
        System.out.println("\nSorted Array");
       for(x=0;x<l;x++)
        System.out.print(arr[x]+" ");
    }
}