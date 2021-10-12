import java.util.*;
public class Main {

    public static int countWays(String str, String []keys, String ans){
        if(str.length()==0){
            return 1;
        }

        int count = 0;

        String curr = keys[str.charAt(0) - '0'];

        for(char ch: curr.toCharArray()){
            count+= countWays(str.substring(1), keys, ans + ch);
        }

        return count;
    }

    public static ArrayList<String > getWays(String str, String []keys){
        if(str.length()==0){
            ArrayList<String > base = new ArrayList<>();
            base.add("");
            return base;
        }

        int len = str.length() - 1;
        ArrayList<String > recAns = getWays(str.substring(0,len),keys);

        ArrayList<String> myAns = new ArrayList<>();
        String curr = keys[str.charAt(len) - '0'];

        for(char ch: curr.toCharArray()){
            for(String s: recAns){
                myAns.add(s + ch);
            }
        }

        return myAns;
    }

    public static void print(String str, String []keys, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        
        String curr = keys[str.charAt(0) - '0'];
        for(char ch: curr.toCharArray()){
            print(str.substring(1), keys, ans + ch);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        String []keys = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
        System.out.println(countWays(str,keys,""));
        System.out.println(getWays(str,keys));
        print(str,keys,"");
    }
}
