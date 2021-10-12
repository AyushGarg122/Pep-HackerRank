import java.util.*;
public class Main {
    
    public static int[] fill(int []arr, int idx, int count, int tar){
        if(idx==arr.length){
            int []base = new int[count];
            return base;
        }
        
        if(arr[idx]==tar){
            count++;
        }
        
        int []ans = fill(arr,idx+1,count,tar);
        
        if(arr[idx]==tar){
            ans[count-1] = idx;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        int tar = scn.nextInt();
        int idx = scn.nextInt();
        
        int []ans = fill(arr,0,0,tar);
        System.out.println(ans[idx]);
    }
}
