package Level7_string.P1152;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/Level7_string/P1152/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        System.out.println(st.countTokens());

        /*
        String을 readLine으로 받아서 split(" ")으로 했더니 틀렸다고 나옴
        그래서 StringTokenizer를 이용하였더니 정답
        StringTokenizer의 사용법을 잘 익혀두자
         */

    }

}
