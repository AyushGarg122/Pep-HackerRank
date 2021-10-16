import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int []ans = new int[n];
        boolean flag = true;

        for(int i=0; i<n; i++){
            int idx = arr[i];
            ans[idx] = i;
            if(ans[idx]!=arr[idx]){
                flag = false;
            }
        }

        for(int ele: ans){
            System.out.print(ele + " ");
        }

        System.out.println();

        System.out.println(flag);
    }
}
