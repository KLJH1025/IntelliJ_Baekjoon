package Level9_basicMath2.P4948;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/Level9_basicMath2/P4948/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N == 0)
                break;

            boolean[] list = new boolean[2*N+1];
            int count = 0;

            list[0] = list[1] = true;

            for(int i=2; i <= Math.sqrt(2*N); i++){
                if(list[i] == true)
                    continue;
                for(int j = i*i; j <= 2*N; j+=i){
                    list[j] = true;
                }
            }

            for(int k = N+1; k <= 2*N; k++){
                if(list[k] == false)
                    count++;
            }

            System.out.println(count);
        }

    }

}
