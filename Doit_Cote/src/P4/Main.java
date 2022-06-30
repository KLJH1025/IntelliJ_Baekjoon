package P4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream("src/P4/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int queryNum = Integer.parseInt(st.nextToken());

        int map[][] = new int[size+1][size+1];
        int partSum[][] = new int[size+1][size+1];

        for(int i=1; i<size+1; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<size+1; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        partSum[1][1] = map[1][1];
        for(int i=2; i<size+1; i++) {
            partSum[1][i] = partSum[1][i-1] + map[1][i];
            partSum[i][1] = partSum[i-1][1] + map[i][1];
        }

        for(int i=2; i<size+1; i++){
            for(int j=2; j<size+1; j++){
                partSum[i][j] = partSum[i-1][j] + partSum[i][j-1] - partSum[i-1][j-1] + map[i][j];
            }
        }

        for(int i=0; i<queryNum; i++){
            st = new StringTokenizer(br.readLine());
            int startRow = Integer.parseInt(st.nextToken());
            int startCol = Integer.parseInt(st.nextToken());
            int endRow = Integer.parseInt(st.nextToken());
            int endCol = Integer.parseInt(st.nextToken());

            System.out.println(partSum[endRow][endCol] - partSum[startRow-1][endCol] - partSum[endRow][startCol-1] + partSum[startRow-1][startCol-1]);
        }
//        for(int i=0; i<size+1; i++){
//            for(int j=0;j<size+1; j++){
//                System.out.print(partSum[i][j] + " ");
//            }
//            System.out.println();
//        }

    }
}
