import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int i = 0, j = n-1;
        while (i<j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }

        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
}
