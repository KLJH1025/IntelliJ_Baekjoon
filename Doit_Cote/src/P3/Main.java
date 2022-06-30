package P3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        //Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int dataNum = Integer.parseInt(st.nextToken());
        int queryNum = Integer.parseInt(st.nextToken());

        int dataList[] = new int[dataNum+1];
        int partSum[] = new int[dataNum+1];
        dataList[0] = 0;
        partSum[0] = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<dataNum+1; i++){
            dataList[i] = Integer.parseInt(st.nextToken());
            partSum[i] = partSum[i-1] + dataList[i];
        }

        for(int i=0; i<queryNum; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            System.out.println(partSum[end] - partSum[start-1]);

        }


    }
}
