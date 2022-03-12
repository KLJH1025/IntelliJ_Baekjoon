package Level14_backTracking.P15650;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static int[] arr;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/Level14_backTracking/P15650/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        check = new boolean[N];


        dfs(N, M, 0);
        System.out.println(sb);

    }

    static void dfs(int N, int M, int depth){
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
