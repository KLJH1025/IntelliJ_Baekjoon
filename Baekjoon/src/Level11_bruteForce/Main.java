package Level11_bruteForce;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/Level11_bruteForce/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] map = new char[N][M];

        char[] chess1 = {'B','W','B','W','B','W','B','W'};
        char[] chess2 = {'W','B','W','B','W','B','W','B'};

        for(int i = 0; i<N; i++){
            String temp = br.readLine();
            for(int j=0; j<M; j++){
                map[i][j] = temp.charAt(j);
            }
        }

        int count1 = 0;
        int count2 = 0;

        for(int i=0; i<=N-8; i+=2){
            for(int j=0; j<=M-8; j++){
                for(int k=0; k<8; k+=1){
                    if(map[i][j+k] == chess1[k]){
                        count1++;
                    }
                    else{
                        count2++;
                    }
                    if(map[i+1][j+k] == chess2[k]){
                        count1++;
                    }
                    else{
                        count2++;
                    }
                }
            }
        }

        System.out.println(count1);
        System.out.println(count2);

    }

}


