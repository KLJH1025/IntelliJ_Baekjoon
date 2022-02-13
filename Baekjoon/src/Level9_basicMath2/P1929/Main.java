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

        boolean[] list = new boolean[M+1];

        list[0] = false;
        list[1] = false;
        for(int i=2; i<=M; i++){

        }

        for(int i=N; i<=M; i++){
            if(function(i))
                System.out.println(i);
        }

    }

    static boolean function(int a){
        if(a < 2)
            return false;
        else{
            for(int i=2; i<=Math.sqrt(a); i++){
                if(a%i == 0)
                    return false;
            }
            return true;
        }
    }
}
