import java.util.*;
public class Main {
    
    public static String separate(String str, char prev){
        if(str.length()==0){
            String base = new String("");
            return base;
        }
        
        char curr = str.charAt(0);
        String ans = separate(str.substring(1), curr);
        ans = curr + ans;
        
        return curr==prev? "*" + ans: ans;
    }
    
    public static void print(String str, char prev, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        
        char curr = str.charAt(0);
        
        if(curr==prev){
            print(str.substring(1),curr,ans + "*" + curr);    
        }else{
            print(str.substring(1), curr, ans + curr);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int idx = scn.nextInt();

        System.out.println(separate(str, ' ').charAt(idx));
        print(str,' ',"");
    }
}
