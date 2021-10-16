import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        for(int ele: arr){
            max = Math.max(max,ele);
        }

        System.out.println(max);
    }
}
