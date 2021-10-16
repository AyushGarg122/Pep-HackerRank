import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        while(n % m!=0){
            int r = n % m;
            n = m;
            m = r;
        }

        System.out.println(m);
    }
}
