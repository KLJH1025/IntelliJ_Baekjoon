package Level8_basicMath1.P2775;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/Level8_basicMath1/P2775/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            int floor = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());

            int[][] map = new int[floor+1][room+1];

            for(int j=0; j<=floor; j++){
                map[j][0] = 0;
                map[j][1] = 1;
            }

            for(int j=0; j<=room; j++){
                map[0][j] = j;
            }

            for(int j = 1; j <= floor; j++){
                for(int k = 1; k <= room; k++){
                    map[j][k] = map[j-1][k] + map[j][k-1];
                }
            }
            System.out.println(map[floor][room]);
        }
    }
}
