package Level12_sort.P2751;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        System.setIn(new FileInputStream("src/Level12_sort/P2751/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        boolean[] list = new boolean[2000001];

        for(int i=0; i<N; i++){
            int tmp = Integer.parseInt(br.readLine());
            list[tmp+1000000] = true;
        }

        StringBuilder sb = new StringBuilder();

        int count = -1000000;
        for(boolean temp : list){
            if(temp){
                sb.append(count).append('\n');
            }
            count++;
        }

        System.out.println(sb);

    }
}
