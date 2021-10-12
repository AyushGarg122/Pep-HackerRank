import java.util.*;
public class Main {

    public static long toInteger(String str, long div){
        if(str.length()==0){
            return 0;
        }

        return  (str.charAt(0) - '0') * div + toInteger(str.substring(1),div/10);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();

        long div = (long)Math.pow(10,str.length()-1);

        System.out.println(toInteger(str,div) / k);
    }
}
