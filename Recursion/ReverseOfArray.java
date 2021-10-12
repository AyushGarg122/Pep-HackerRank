import java.util.*;
public class Main {
    
    public static int[] reverse(int []arr, int idx){
        if(idx==arr.length){
            int []base = new int[arr.length];
            return base;
        }
        
        int []ans = reverse(arr,idx+1);
        ans[arr.length - idx - 1] = arr[idx];
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        int idx = scn.nextInt();
        int []ans = reverse(arr,0);
        
        for(int ele: ans){
            System.out.print(ele + " ");
        }

        System.out.println();
        System.out.println(ans[idx]);
    }
}
