package Level14_backTracking.P15649;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int N; // 1~N까지의 정수 중에서
    public static int M; // M개의 배열
    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream("src/Level14_backTracking/P15649/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N];

        dfs(0);
        System.out.println(sb);

    }

    public static void dfs(int depth){
        if(depth == M){
            for(int a : arr){
                sb.append(a).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i=0; i<N; i++){
            if(!visit[i]){
                visit[i] = true;
                arr[depth] = i+1;
                dfs(depth+1);
                visit[i] = false;
            }
        }
    }
}
