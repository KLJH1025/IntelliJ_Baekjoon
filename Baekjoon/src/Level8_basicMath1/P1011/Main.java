package Level8_basicMath1.P1011;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/Level8_basicMath1/P1011/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int distance = b - a;

            int max = (int)Math.sqrt(distance);

            if(max == Math.sqrt(distance)){
                System.out.println(max*2 - 1);
            }
            else if(distance <= max*max + max){
                System.out.println(max*2);
            }
            else{
                System.out.println(max*2 + 1);
            }

        }
    }

}
