import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int st = 1, sp = n / 2, val = 1;
        
        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            
            int cc = val;
            for(int j=1; j<=st; j++){
                System.out.print(cc + " ");
                if(j<=st/2){
                    cc++;
                }else{
                    cc--;
                }
            }

            System.out.println();
            if(i<=n/2){
                st+=2;
                sp--;
                val++;
            }else{
                val--;
                sp++;
                st-=2;
            }
        }
    }
}
