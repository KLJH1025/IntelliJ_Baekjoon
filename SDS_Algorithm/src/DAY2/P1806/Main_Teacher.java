package DAY2.P1806;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_Teacher {

    static int N;
    static int M;
    static int[] nums;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/DAY2/P1806/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        nums = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int low = 0;
        int high = 0;
        int sum = nums[0];
        int minLength = Integer.MAX_VALUE;

        while(true){
            if(sum >= M){
                int temp = high - low + 1;
                if(temp < minLength)
                    minLength = temp;
                sum -= nums[low++];
            }
            else{
                sum += nums[++high];
            }

            if(high == N){
                break;
            }

        }

        if(minLength == Integer.MAX_VALUE)
            System.out.println("0");
        else
            System.out.println(minLength);

    }
}
