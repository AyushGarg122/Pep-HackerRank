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
        int []b = new int[n];
        
        input(a);
        input(b);
        
        boolean flag = true;
        for(int i=0; i<n; i++){
            if(b[a[i]] != i){
                flag = false;
                break;
            }
        }

        System.out.println(flag);
    }
}
