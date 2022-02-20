package Level12_sort.P2108;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws Exception {

        System.setIn(new FileInputStream("src/Level12_sort/P2108/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int average = 0;
        int midValue = 100000;
        int frequency = 100000;
        int highValue = Integer.MIN_VALUE;
        int lowValue = Integer.MAX_VALUE;

        int[] arr = new int[8001];

        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(br.readLine());
            average += temp;
            arr[temp+4000]++;

            if(temp > highValue)
                highValue = temp;
            if(temp < lowValue)
                lowValue = temp;

        }

        int count = 0;
        int find = 0;
        boolean flag = false;

        for(int i= lowValue+4000; i<= highValue+4000; i++){

            if(arr[i] > 0){

                if(count < (N+1)/2){
                    count += arr[i];
                    midValue = i -4000;
                }

                if(find < arr[i]){
                    find = arr[i];
                    frequency = i - 4000;
                    flag = true;
                }
                else if(find == arr[i] && flag == true){
                    frequency = i - 4000;
                    flag = false;
                }

            }
        }

        System.out.println((int)Math.round((double)average/N));
        System.out.println(midValue);
        System.out.println(frequency);
        System.out.println(highValue - lowValue);

    }
}
