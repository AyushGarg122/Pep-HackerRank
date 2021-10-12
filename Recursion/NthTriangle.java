import java.util.*;
public class Main {
    
    public static long sum(long n){
        if (n == 0) {
            return 0;
        }
        
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n =  scn.nextLong();
        System.out.println(sum(n));
    }
}
