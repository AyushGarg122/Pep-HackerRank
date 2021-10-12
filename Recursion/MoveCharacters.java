import java.util.*;
public class Main {
    
    public static String move(String str, char ch){
        if(str.length()==0){
            String base = new String("");
            return base;
        }
        
        char curr = str.charAt(0);
        String ans = move(str.substring(1),ch);
        
        return curr==ch? ans + curr : curr + ans;
    }
    
    public static void print(String str, char ch){
        if(str.length()==0){
            return;
        }
        
        char curr = str.charAt(0);
        
        if(curr!=ch){
            System.out.print(curr);
        }
        
        print(str.substring(1), ch);

        if(curr==ch){
            System.out.print(curr);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char ch = scn.next().charAt(0);
        int idx = scn.nextInt();

        System.out.println(move(str,ch).charAt(idx));
        print(str,ch);
    }
}
