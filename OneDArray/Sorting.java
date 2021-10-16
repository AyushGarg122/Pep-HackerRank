import java.util.*;
public class Main {

    static Scanner scn = new Scanner(System.in);

    public static void input(int []arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }

    public static void display(int []arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }

        System.out.println();
    }

    public static void swap(int []arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void bubbleSort(int []arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public static void insertionSort(int []arr){
        int n = arr.length;

        int i = 1;
        while(i<n){
            int j = i;
            while(j>=1 && arr[j]>arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
            i++;
        }
    }

    public static void selectionSort(int []arr){
        int n = arr.length;
        for(int i=0; i<n - 1; i++){
            int min = arr[i];
            int idx = i;

            for(int j=i+1; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    idx = j;
                }
            }

            if(idx!=i){
                swap(arr,i,idx);
            }
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int []a = new int[n];
        int []b = new int[n];
        int []c = new int[n];

        input(a);
        input(b);
        input(c);

        bubbleSort(a);
        insertionSort(b);
        selectionSort(c);

        display(a);
        display(b);
        display(c);
    }
}
