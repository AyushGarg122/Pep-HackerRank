import java.util.*;
public class Main {
    
    public static int countPer(String str, String ans){
        if(str.length()==0){
            return 1;
        }
        
        int count = 0;
        
        for(int i=0; i<str.length(); i++){
            String nstr = str.substring(0,i) + str.substring(i+1);
            char curr = str.charAt(i);
            
            count+= countPer(nstr,ans + curr);
        }
        
        return count;
    }
    
    public static ArrayList<String > getPer(String str){
        if(str.length()==0){
            ArrayList<String > base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String > myAns = new ArrayList<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String nstr = str.substring(0,i) + str.substring(i + 1);
            
            ArrayList<String > recAns = getPer(nstr);
            for(String  s: recAns){
                myAns.add(ch + s);
            }
        }
        
        return myAns;
    }
    
    public static void print(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String nstr = str.substring(0,i) + str.substring(i + 1);
            
            print(nstr,ans + ch);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(countPer(str,""));
        System.out.println(getPer(str));
        print(str,"");
    }
}
