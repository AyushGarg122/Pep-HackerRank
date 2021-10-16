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

        Arrays.sort(arr);
        
        int i = 0, j = n - 1;
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum==tar){
                System.out.println(arr[i] + " and " + arr[j]);
                i++;
                j--;
            }else if(sum>tar){
                j--;
            }else{
                i++;
            }
        }
    }
}
