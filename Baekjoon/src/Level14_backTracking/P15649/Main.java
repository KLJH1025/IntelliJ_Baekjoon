package Level14_backTracking.P15649;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int N;
    public static int M;
    public static int[] arr;
    public static boolean[] check;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/Level14_backTracking/P15649/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        check = new boolean[N];
        arr = new int[M];
        dfs(N, M ,0);
        System.out.println(sb);


    }

    public static void dfs(int N, int M, int depth){

        if(depth == M){
            for(int i : arr){
                sb.append(i).append(" ");
            }
            sb.append('\n');
            return;
        }

        for(int i=0; i<N; i++){
            if(check[i] == false){
                check[i] = true;
                arr[depth] = i+1;
                dfs(N, M, depth+1);
                check[i] = false;
            }
        }

    }
}
