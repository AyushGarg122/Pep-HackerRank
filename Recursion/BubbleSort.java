import java.util.*;
public class Main {
    
    public static void swap(int []arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    
    public static void sort(int []arr, int idx){
        if(idx==arr.length-1){
            return;
        }
        
        for(int i=0; i<arr.length-idx-1; i++){
            if(arr[i]>arr[i+1]){
               swap(arr,i,i+1); 
            }
        }
        
        sort(arr,idx+1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        sort(arr,0);
        
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
}
