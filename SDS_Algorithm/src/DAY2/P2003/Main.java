package DAY2.P2003;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static int[] nums;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/DAY2/P2003/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        nums = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(nums));

        int low = 0;
        int high = 0;
        int sum = 0;
        int count = 0;

        sum = nums[0];

        while (true) {
            // sum == M -> 답 low++
            if (sum == M) {
                count++;
                sum -= nums[low];
                low++;
                //sum -= nums[low++];
            }
            // sum > M -> low++
            else if (sum > M) {
                // sum < M -> high++
            }


        }
    }
}
