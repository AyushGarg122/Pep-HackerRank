import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int st = 1, sp = (n * 2) - 3;

        for(int i=1; i<=n; i++){

            int cc = 1;
            for(int j=1; j<=st; j++){
                System.out.print(cc + " ");
                cc++;
            }

            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }

            if(i==n){
                st--;
                cc--;
            }

            cc--;
            for(int j=1; j<=st; j++){
                System.out.print(cc + " ");
                cc--;
            }

            System.out.println();
            st++;
            sp-=2;
        }
    }
}
