package Level9_basicMath2.P1929;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/Level9_basicMath2/P1929/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //출력값이 많을 수 있으니 StringBuilder를 이용해보자
        StringBuilder sb = new StringBuilder();

        //StringBuilder를 사용했더니 그냥 System.out.println()을 사용했을때 보다
        //시간이 800ms에서 264ms까지 줄이는데 성공했다.


        // 소수를 구하는 알고리즘: 에라토스테네스의 체를 이용
        boolean[] list = new boolean[M+1];
        list[0] = list[1] = true;
        // 소수가 아니면 true, 소수가 맞으면 false

        for(int i=2; i <= Math.sqrt(M); i++){
            if(list[i] == true)
                continue;

            for(int j = i*i; j <= M; j+=i){
                list[j] = true;
            }
        }

        for(int i=N; i <= M; i++){
            if(list[i] == false)
                sb.append(i).append('\n');
        }

        System.out.println(sb);


    }


}
