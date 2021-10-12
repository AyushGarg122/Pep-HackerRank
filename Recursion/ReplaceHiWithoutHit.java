import java.util.*;
public class Main {

    public static String replace(String str){
        if(str.length()==0){
            String base = new String("");
            return base;
        }

        String ans = "";

        if(str.length()>2 && str.substring(0,3).equals("hit")){
            ans+= replace(str.substring(3));
            ans = "hit" + ans;
        }else if(str.length()>1 && str.substring(0,2).equals("hi")){
            ans+= replace(str.substring(2));
            ans = "pep" + ans;
        }else{
            ans+= replace(str.substring(1));
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
            print(str.substring(2), ans + "pep");
        }else{
            print(str.substring(1), ans + str.charAt(0));
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int idx = scn.nextInt();

        System.out.println(replace(str).charAt(idx));
        print(str,"");
    }
}
