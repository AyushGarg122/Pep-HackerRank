import java.util.*;
public class Main {
    
    public static boolean check(int []arr, int idx){
        if(idx==arr.length){
            return true;
        }
        
        return arr[idx]>=arr[idx-1] && check(arr,idx+1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println(check(arr,1));
    }
}
