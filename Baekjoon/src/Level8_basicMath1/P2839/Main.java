package Level8_basicMath1.P2839;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/Level8_basicMath1/P2839/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int five = 0;
        int three = 0;
        int flag = 0;
        while(true) {
            if (N % 5 == 0) {
                five = N / 5;
                break;
            }
            else{
                three++;
                N -= 3;
                if(N < 0){
                    flag = 1;
                    break;
                }
            }
        }

        if(flag == 1){
            System.out.println("-1");
        }
        else{
            System.out.println(five+three);
        }




    }
}
