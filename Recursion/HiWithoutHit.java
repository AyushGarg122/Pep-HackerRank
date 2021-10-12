import java.util.*;
public class Main {

    public static int countHi(String str){
        if(str.length()==0){
            return 0;
        }

        int count = 0;

        if(str.length()>2 && str.substring(0,3).equals("hit")){
            count+= countHi(str.substring(3));
        }else if(str.length()>1 && str.substring(0,2).equals("hi")){
            count+= countHi(str.substring(2));
            count+=1;
        }else{
            count+= countHi(str.substring(1));
        }

        return count;
    }

    public static String removeHi(String str){
        if(str.length()==0){
            String base = new String("");
            return base;
        }

        String ans = "";

        if(str.length()>2 && str.substring(0,3).equals("hit")){
            ans+= removeHi(str.substring(3));
            ans = "hit" + ans;
        }else if(str.length()>1 && str.substring(0,2).equals("hi")){
            ans+= removeHi(str.substring(2));
        }else{
            ans+= removeHi(str.substring(1));
            ans = str.charAt(0) + ans;
        }

        return ans;
    }

    public static void print(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        if(str.length()>2 && str.substring(0,3).equals("hit")){
            print(str.substring(3), ans + "hit");
        }else if(str.length()>1 && str.substring(0,2).equals("hi")){
            print(str.substring(2), ans);
        }else{
            print(str.substring(1), ans + str.charAt(0));
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int idx = scn.nextInt();

        System.out.println(countHi(str));
        System.out.println(removeHi(str).charAt(idx));
        print(str,"");
    }
}
