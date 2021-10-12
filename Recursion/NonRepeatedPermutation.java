import java.util.*;
public class Main {

    public static int countPer(String str, String ans){
        if(str.length()==0){
            return 1;
        }
        
        int visited = 0;
        int count = 0;
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int val = str.charAt(i) - '0';
            String nstr = str.substring(0,i) + str.substring(i+1);
            
            if((visited & (1<<val))==0){
                visited = visited ^ (1<<val);
                count+= countPer(nstr,ans + ch);
            }
        }
        
        return count;
    }
    
    public static void print(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        
        int visited = 0;
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int val = str.charAt(i) - '0';
            String nstr = str.substring(0,i) + str.substring(i+1);

            if((visited & (1<<val))==0){
                visited = visited ^ (1<<val);
                print(nstr,ans + ch);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        System.out.println(countPer(str,""));
        print(str,"");
    }
}
