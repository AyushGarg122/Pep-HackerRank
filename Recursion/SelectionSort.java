import java.util.*;
public class Main {

    public static void swap(int []arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void sort(int []arr, int idx){
        if(idx==arr.length - 1){
            return;
        }

        int min = arr[idx];
        int j = idx;

        for(int i=idx+1; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
                j = i;
            }
        }

        if(j!=idx){
            swap(arr,j,idx);
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
