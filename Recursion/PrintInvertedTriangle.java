import java.util.*;
public class Main {
    
    public static void print(int n){
        if(n==0){
            return;
        }
        
        for(int i=1; i<=n; i++){
            System.out.print("*");
        }
        System.out.println();
        
        print(n-1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print(n);
    }
}
