package Level8_basicMath1.P1193;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.BatchUpdateException;

public class Main {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/Level8_basicMath1/P1193/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int start = 0;
        int var = 1;
        int endPoint = 1; // 그 라인의 최대값이 좌쪽: 0, 우쪽: 1

        int mother = 0;
        int son = 0;

        while(true){
            if(a > start && a<= start + var){
                if(endPoint == 1){
                    son = var;
                    mother = 1;

                    int tmp = a - start - 1;
                    son -= tmp;
                    mother += tmp;
                }
                else {
                    son = 1;
                    mother = var;

                    int tmp = a - start - 1;
                    son += tmp;
                    mother -= tmp;
                }
                break;
            }
            else{
                start = start + var;
                var += 1;
                if(endPoint == 0)
                    endPoint = 1;
                else
                    endPoint = 0;
            }
        }

        System.out.println(son + "/" + mother);
    }

}
