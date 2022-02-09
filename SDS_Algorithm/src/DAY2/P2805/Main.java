package DAY2.P2805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static int[] nums;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/DAY2/P2805/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        nums = new int[N+1];
        st = new StringTokenizer(br.readLine());
        int max = -1;
        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
            if(max < nums[i])
                max = nums[i];
        }

        int getTree = 0;
        long maxTreeLength = max;
        long standard = maxTreeLength / 2;
        long variable = maxTreeLength / 2;

        ArrayList<Long> tempValue = new ArrayList<>(N);

        while(true) {
            getTree = 0;
            //variable = variable / 2;

            long temp = 0;
            for (int i = N-1; i >= 0; i--) {
                temp = nums[i] - standard;
                if (temp > 0)
                    getTree += temp;
            }

            if (getTree == M) {
                break;
            } else if (getTree < M) {
                if(variable%2==0) {
                    variable = variable/2;
                    standard = standard - variable;
                }
                else{
                    standard -= 1;
                    variable += 1;
                    variable = variable/2;
                    standard = standard - variable;
                }
            } else { //getTree > M
                if(variable%2==0) {
                    variable = variable/2;
                    tempValue.add(standard);
                    standard = standard + variable;
                }
                else{
                    standard += 1;
                    variable -= 1;
                    variable = variable/2;
                    standard = standard + variable;
                }
            }

            if(variable == 1){
                Collections.sort(tempValue);
                standard = tempValue.get(tempValue.size()-1);
                break;
            }

        }

        System.out.println(standard);

    }

}
