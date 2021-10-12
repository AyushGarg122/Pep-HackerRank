import java.util.*;
public class Main {

    public static int countSub(int []arr, int idx, int sum1, int sum2){
        if(idx==arr.length){
            if(sum1==sum2){
                return 1;
            }
            return 0;
        }

        int count = 0;

        count+= countSub(arr,idx+1,sum1+arr[idx],sum2);
        count+= countSub(arr,idx+1,sum1,sum2 + arr[idx]);

        return count;
    }

    public static class Pair{
        String set1;
        String set2;

        Pair(String set1, String set2){
            this.set1 = set1;
            this.set2 = set2;
        }
    }

    public static ArrayList<Pair> getSub(int []arr, int idx, int sum1, int sum2){
        if(idx==arr.length){
            if(sum1==sum2){
                ArrayList<Pair> base = new ArrayList<>();
                base.add(new Pair("",""));
                return base;
            }

            return new ArrayList<>();
        }

        ArrayList<Pair> recAns1 = getSub(arr,idx+1,sum1 + arr[idx], sum2);
        ArrayList<Pair> recAns2 = getSub(arr,idx+1,sum1, sum2 + arr[idx]);

        ArrayList<Pair> myAns = new ArrayList<>();

        for(Pair p: recAns1){
            myAns.add(new Pair(arr[idx] + " " + p.set1,p.set2));
        }

        for(Pair p: recAns2){
            myAns.add(new Pair(p.set1,arr[idx] + " " + p.set2));
        }

        return myAns;
    }

    public static void print(int []arr, int idx, int sum1, int sum2, String ans1, String ans2){
        if(idx==arr.length){
            if(sum1==sum2){
                System.out.println(ans1 + "\t" + ans2);
            }
            return;
        }

        print(arr,idx+1,sum1+arr[idx],sum2,ans1 + arr[idx] + " ", ans2);
        print(arr,idx+1,sum1,sum2 + arr[idx],ans1 , ans2 + arr[idx] + " ");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        ArrayList<Pair> myAns = getSub(arr,0,0,0);
        ArrayList<String > ans = new ArrayList<>();

        for(Pair p: myAns){
            ans.add(p.set1 + " and " + p.set2);
        }

        System.out.println(countSub(arr,0,0,0));
        System.out.println(ans);
        print(arr,0,0,0,"","");
    }
}
