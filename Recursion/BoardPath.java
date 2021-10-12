import java.util.*;
public class Main {

    public static int countWays(int si, int ei, int jumps){
        if(si==ei){
            return 1;
        }
        
        int count = 0;
        
        for(int i=1; i<=jumps; i++){
            if(si + i<=ei){
                count+= countWays(si + i,ei,jumps);
            }else{
                break;
            }
        }
        
        return count;
    }
    
    public static ArrayList<String > getWays(int si, int ei, int jumps){
        if(si==ei){
            ArrayList<String > base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String > myAns = new ArrayList<>();
        
        for(int i=1; i<=jumps; i++){
            if(si + i<=ei){
                ArrayList<String > recAns = getWays(si+i,ei,jumps);
                for(String s: recAns){
                    myAns.add(i + s);
                }
            }else{
                break;
            }
        }
        
        return myAns;
    }
    
    public static void print(int si, int ei, int jumps, String ans){
        if(si==ei){
            System.out.println(ans);
            return;
        }
        
        for(int i=1; i<=jumps; i++){
            if(si + i<=ei){
                print(si + i, ei,jumps,ans + i);
            }else{
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int jumps = scn.nextInt();

        System.out.println(countWays(0,n,jumps));
        System.out.println(getWays(0,n,jumps));
        print(0,n,jumps,"");
    }
}
