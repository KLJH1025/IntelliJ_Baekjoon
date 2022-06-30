package P7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_answer {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] list = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(list);

        int count = 0;

        int start = 0;
        int end = N-1;

        while(start < end){
            if(list[start] + list[end] < M){
                start++;
            }
            else if(list[start] + list[end] > M){
                end--;
            }
            else{
                count++;
                start++;
                end--;
            }
        }


        System.out.println(count);

    }
}
