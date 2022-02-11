package Level5_1Darray.P4344;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/Level5_1Darray/P4344/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int studentNum = Integer.parseInt(st.nextToken());

            int[] arr = new int[studentNum];
            int total = 0;
            for(int j=0; j<studentNum; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                total += arr[j];
            }

            double average = (double)total / studentNum;
            int count = 0;

            for(int j=0; j<studentNum; j++){
                if(arr[j] > average)
                    count++;
            }

            /*
            System.out.printf()를 통해서 JAVA로도
            형식지정자(%d, %f..) 정해서 소수점을 조정할 수 있다.
             */
            double answer = Math.round((double)count/studentNum * 100000.0);
            System.out.printf("%5.3f", answer/1000.0);
            System.out.println("%");

        }

    }

}
