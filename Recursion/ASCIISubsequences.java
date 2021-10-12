import java.util.*;
public class Main {

    public static int countSub(String str, String ans){
        if(str.length()==0){
            return 1;
        }

        char curr = str.charAt(0);
        int value = str.charAt(0);

        int count = 0;

        count+= countSub(str.substring(1), ans);
        count+= countSub(str.substring(1), ans + curr);
        count+= countSub(str.substring(1), ans + value);

        return count;
    }

    public static ArrayList<String > getSub(String str){
        if(str.length()==0){
            ArrayList<String > base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String > recAns = getSub(str.substring(1));
        
        ArrayList<String > myAns = new ArrayList<>(recAns);
        char curr = str.charAt(0);
        int val = str.charAt(0);

        
        for(String s: recAns){
            myAns.add(curr + s);
        }
        
        for(String s: recAns){
            myAns.add(val + s);
        }
        
        return myAns;
    }
    
    public static void print(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        
        char curr = str.charAt(0);
        int val = str.charAt(0);
        
        print(str.substring(1), ans);
        print(str.substring(1), ans + curr);
        print(str.substring(1), ans + val);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(countSub(str,""));
        System.out.println(getSub(str));
        print(str,"");
    }
}
