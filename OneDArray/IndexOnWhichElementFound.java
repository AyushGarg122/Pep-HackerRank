import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();

        for(int ele: arr){
            if(ele<0){
                System.out.println("Invalid Input");
                return;
            }
        }

        int ans = -1;
        for(int i=0; i<n; i++){
            if(arr[i]==tar){
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}
