import java.util.*;
public class Main {
    
    public static int find(int []arr, int idx, int tar){
        if(idx==arr.length){
            return -1;
        }
        
        int ans = find(arr,idx+1,tar);
        if(ans!=-1){
            return ans;
        }else if(arr[idx]==tar){
            return idx;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        int tar = scn.nextInt();
        System.out.println(find(arr,0,tar));
    }
}
