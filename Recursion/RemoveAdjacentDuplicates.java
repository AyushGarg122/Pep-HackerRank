import java.util.*;
public class Main {

    public static String remove(String str, char prev){
        if(str.length()==0){
            String base = new String("");
            return base;
        }

        char curr = str.charAt(0);
        String ans = remove(str.substring(1), curr);

        return curr==prev? ans : curr + ans;
    }

    public static void print(String str, char prev, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        char curr = str.charAt(0);
        print(str.substring(1),curr,ans + ((curr==prev)? "": curr));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int idx = scn.nextInt();

        System.out.println(remove(str,' ').charAt(idx));
        print(str,' ', "");
    }
}
