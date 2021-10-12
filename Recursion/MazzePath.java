import java.util.*;
public class Main {

    public static int countPaths(int sr, int sc, int er, int ec, int [][]dir){
        if(sr==er && sc==ec){
            return 1;
        }

        int count = 0;

        for(int i=0; i<dir.length; i++){
            int r = sr + dir[i][0];
            int c = sc + dir[i][1];

            if(r<=er && c<=ec){
                count+= countPaths(r,c,er,ec,dir);
            }
        }

        return count;
    }

    public static ArrayList<String > getPaths(int sr, int sc, int er, int ec, int [][]dir, String []dirS){
        if(sr==er && sc==ec){
            ArrayList<String > base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String > myAns = new ArrayList<>();

        for(int i=0; i<dir.length; i++){
            int r = sr + dir[i][0];
            int c = sc + dir[i][1];

            if(r<=er && c<=ec){
                ArrayList<String> recAns = getPaths(r,c,er,ec,dir,dirS);
                for(String  s: recAns){
                    myAns.add(dirS[i] + s);
                }
            }
        }

        return myAns;
    }

    public static void printPaths(int sr, int sc, int er, int ec, int [][]dir, String  []dirS, String ans){
        if(sr==er && sc==ec){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<dir.length; i++){
            int r = sr + dir[i][0];
            int c = sc + dir[i][1];

            if(r<=er && c<=ec){
                printPaths(r,c,er,ec,dir,dirS,ans + dirS[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int [][]dir = {{0,1}, {1,0}};
        String []dirS = {"H", "V"};

        n--;
        m--;
        System.out.println(countPaths(0,0,n,m,dir));
        System.out.println(getPaths(0,0,n,m,dir,dirS));
        printPaths(0,0,n,m,dir,dirS,"");
    }
}
