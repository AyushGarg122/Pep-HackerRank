import java.util.*;
public class Main {
    
    public static void print(long n){
        if(n==0){
            return;
        }
        
        if(n % 2==1){
            System.out.println(n);
        }
        
        print(n - 1);
        
        if(n % 2==0){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        print(n);
    }
}
