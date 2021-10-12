import java.util.*;
public class Main {
    
    public static boolean check(String str, int l, int r){
        if(l>=r){
            return true;
        }
        
        int diff = Math.abs(str.charAt(l) - str.charAt(r));
        
        return (diff==0 || diff==32) && check(str,l+1,r-1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(check(str,0,str.length()-1));
    }
}
