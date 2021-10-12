import java.util.*;
public class Main {
    
    public static int sum(String str){
        if(str.length()==0){
            return 0;
        }
        
        return (str.charAt(0) - '0') + sum(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(sum(str));
    }
}
