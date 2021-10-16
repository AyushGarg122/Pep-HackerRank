import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i=2; i<=n; i++){
            boolean flag = true;
            
            for(int j=2; j*j<=i; j++){
                if(i % j==0){
                    flag = false;
                    break;
                }
            }
            
            if(flag){
                System.out.print(i + " ");
            }
        }
    }
}
