import java.util.*;
public class Main {

    public static void print(int n){
        if(n==0){
            return;
        }
        
        print(n - 1);
        
        int ncr = 1;
        n--;
        
        for(int i=0; i<=n; i++){
            System.out.print(ncr);
            int ncrpo = (ncr * (n - i)) / (i + 1);
            ncr = ncrpo;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print(n);
    }
}
