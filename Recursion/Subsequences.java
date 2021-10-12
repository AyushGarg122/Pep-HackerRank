import java.util.*;
public class Main {
    
    public static int countSub(String str, String ans){
        if(str.length()==0){
            return 1;
        }
        
        char curr = str.charAt(0);
        int count = 0;
        
        count+= countSub(str.substring(1), ans + curr);
        count+= countSub(str.substring(1), ans);
        
        return count;
    }
    
    public static ArrayList<String> getSub(String str){
        if(str.length()==0){
            ArrayList<String > base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> recAns = getSub(str.substring(0,str.length()-1));
        
        ArrayList<String> myAns = new ArrayList<>(recAns);
        
        char curr = str.charAt(str.length()-1);
        for(String s: recAns){
            myAns.add(s + curr);
        }
        
        return myAns;
    }
    
    public static void print(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        
        char curr = str.charAt(0);
        
        print(str.substring(1), ans);
        print(str.substring(1), ans + curr);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        System.out.println(countSub(str,""));
        System.out.println(getSub(str));
        print(str,"");
    }
}
