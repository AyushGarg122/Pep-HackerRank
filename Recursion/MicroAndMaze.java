import java.util.*;
public class Main {

    public static boolean check(int [][]arr, int r, int c, int [][]dir){
        int n = arr.length, m = arr[0].length;

        if(r==n-1 && c==m-1){
            return true;
        }

        arr[r][c] = 0;

        for(int i=0; i<dir.length; i++){
            int sr = r + dir[i][0];
            int sc = c + dir[i][1];

            if(sr>=0 && sc>=0 && sr<n && sc<m && arr[sr][sc] == 1){
                if(check(arr,sr,sc,dir)){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int [][]arr = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int [][]dir = {{-1,0}, {0,-1}, {1,0}, {0,1}};

        String ans = check(arr,0,0,dir)? "Yes": "No";
        System.out.println(ans);
    }
}
