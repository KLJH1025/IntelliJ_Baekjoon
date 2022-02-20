package Level12_sort.P10989;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        System.setIn(new FileInputStream("src/Level12_sort/P10989/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[10001];

        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(br.readLine());
            arr[temp] += 1;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<10001; i++){
            if(arr[i] > 0){
                while(arr[i] != 0){
                    sb.append(i).append('\n');
                    arr[i] -= 1;
                }
            }
        }

        System.out.println(sb);

    }
}
