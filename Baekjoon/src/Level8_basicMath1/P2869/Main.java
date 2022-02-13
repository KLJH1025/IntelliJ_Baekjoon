package Level8_basicMath1.P2869;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream("src/Level8_basicMath1/P2869/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int Up = Integer.parseInt(st.nextToken());
        int Sleep = Integer.parseInt(st.nextToken());
        int Height = Integer.parseInt(st.nextToken());

        int count = 0;
        /*
        달팽이가 나무막대기를 올라가고 내려가는 모든 상황을
        while(true)문을 통해서 구현하면 시간초과가 났다.
        나눗셈을 이용하여 계산량을 줄였다.
         */

        int tmp = Height - Up;

        count = tmp / (Up-Sleep);
        if(tmp % (Up-Sleep) != 0)
            count+=1;
        count+=1;

        System.out.println(count);


    }

}
