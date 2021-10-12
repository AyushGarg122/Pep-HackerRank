import java.util.*;
public class Main {

    public static int countSub(int []arr, int idx, int sum, int tar){
        if(idx==arr.length){
            if(sum==tar){
                return 1;
            }

            return 0;
        }

        int count = 0;

        count+= countSub(arr,idx+1,sum + arr[idx],tar);
        count+= countSub(arr,idx+1,sum,tar);

        return count;
    }

    public static void print(int []arr, int idx, int sum, int tar, String ans){
        if(idx==arr.length){
            if(sum==tar){
                System.out.println(ans);
            }
            return;
        }

        print(arr,idx+1,sum,tar, ans);
        print(arr,idx+1,sum + arr[idx],tar,ans + arr[idx] + " ");
    }

    public static ArrayList<String > getSub(int []arr, int idx, int sum, int tar){
        if(idx==arr.length){
            if(sum==tar){
                ArrayList<String > base = new ArrayList<>();
                base.add("");
                return base;
            }

            return new ArrayList<>();
        }

        ArrayList<String > recAns1 = getSub(arr,idx+1,sum,tar);
        ArrayList<String > recAns2 = getSub(arr,idx+1,sum+arr[idx],tar);

        ArrayList<String > myAns = new ArrayList<>(recAns1);

        for(String s: recAns2){
            myAns.add(arr[idx] + " " + s);
        }

        return myAns;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();

        System.out.println(countSub(arr,0,0,tar));
        System.out.println(getSub(arr,0,0,tar));
        print(arr,0,0,tar,"");
    }
}
