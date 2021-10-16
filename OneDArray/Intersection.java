import java.util.*;
public class Main {

    static Scanner scn = new Scanner(System.in);

    public static void input(int []arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int []a = new int[n];
        input(a);

        int m = scn.nextInt();
        int []b = new int[m];
        input(b);

        Arrays.sort(a);
        Arrays.sort(b);
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int i = 0, j = 0;
        while(i<n && j<m){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }else if(a[i]>b[j]){
                j++;
            }else{
                i++;
            }
        }

        System.out.println(ans);
    }
}
