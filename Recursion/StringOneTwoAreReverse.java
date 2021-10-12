import java.util.*;
public class Main {

    public static boolean check(String a, String b, int l, int r){
        if(l==a.length()){
            return true;
        }

        return a.charAt(l)== b.charAt(r) && check(a,b,l+1,r-1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        String b = scn.next();

        if(a.length()!=b.length()){
            System.out.println(false);
            return;
        }

        System.out.println(check(a,b,0,b.length()-1));
    }
}
