package Level9_basicMath2.P2581;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/Level9_basicMath2/P2581/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int total = 0;
        int min = Integer.MAX_VALUE;

        for(int i=N; i<=M; i++){

            if(function(i)){
                total += i;
                if(min > i)
                    min = i;
            }

        }

        if(total == 0)
            System.out.println(-1);
        else{
            System.out.println(total);
            System.out.println(min);
        }

    }
    static boolean function(int a){
        if(a == 1)
            return false;
        else{
            for(int i=2; i<=a/2; i++){
                if(a%i == 0)
                    return false;
            }
            return true;
        }
    }
}
