import java.util.*;
public class Main {
    
    public static boolean check(int []arr, int l, int r){
        if(l>=r){
            return true;
        }
        
        return arr[l]==arr[r] && check(arr,l+1,r-1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println(check(arr,0,n-1));
    }
}
