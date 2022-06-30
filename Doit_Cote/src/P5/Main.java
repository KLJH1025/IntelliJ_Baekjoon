package P5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long list[] = new long[N+1];
        long partSum[] = new long[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<N+1; i++){
            list[i] = Long.parseLong(st.nextToken());
            partSum[i] = partSum[i-1] + list[i];
        }

        long answer[] = new long[M];
        for(int i=1; i<N+1; i++){
            partSum[i] = partSum[i] % M;
            answer[(int)partSum[i]]++;
        }

        long total = answer[0];
        for(int i=0; i<M; i++){
            if(answer[i] != 0){
                total += answer[i]*(answer[i]-1)/2;
            }
        }

        System.out.println(total);
    }
}
