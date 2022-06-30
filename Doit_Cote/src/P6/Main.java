package P6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());

        int list[] = new int[10000001];
        for(int i=0; i<10000001; i++)
            list[i] = i;

        int start = 0;
        int end = 1;
        int total = list[start] + list[end];
        int count = 0;
        while(end != N){
            if(total < N){
                end++;
                total += list[end];
            }
            else if(total > N){
                total -= list[start];
                start++;
            }
            else if(total == N){
                count++;
                end++;
                total += list[end];
            }
        }

        count++;
        System.out.println(count);
    }
}
