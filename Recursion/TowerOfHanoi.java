import java.util.*;
public class Main {

    public static int countWays(int n, String source, String helper, String destination){
        if(n==0){
            return 0;
        }
        
        int count = 0;
        
        count+= countWays(n - 1,source,destination,helper);
        count+=1;
        count+= countWays(n - 1,helper,source,destination);
        
        return count;
    }
    
    public static void print(int n, String source, String helper, String destination){
        if(n==0){
            return;
        }
        
        print(n - 1,source,destination,helper);
        System.out.println("Move disc [" + n + "]" + " from " + source + " to " + destination);
        print(n - 1,helper,source,destination);
        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String source = "A";
        String helper = "B";
        String destination = "C";

        System.out.println(countWays(n,source,helper,destination));
        print(n,source,helper,destination);
    }
}
