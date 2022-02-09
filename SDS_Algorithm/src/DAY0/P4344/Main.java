package DAY0.P4344;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int N;


    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/DAY0/P4344/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int studentNum;
        int[] scoreList;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            studentNum = Integer.parseInt(st.nextToken());

            //System.out.println("studentNum: " + studentNum);

            scoreList = new int[studentNum];
            int total = 0;
            for(int j = 0; j < studentNum; j++){
                scoreList[j] = Integer.parseInt(st.nextToken());
                total += scoreList[j];

                //System.out.println("total : " + total);
            }

            int average = total / studentNum;
            //System.out.println("average : " + average);
            int count = 0;
            for(int k=0; k<studentNum; k++){
                if(scoreList[k] > average){
                    count++;
                }
            }

            System.out.printf("%.3f%%\n", (count/(double)studentNum)*100);
        }

    }

}
