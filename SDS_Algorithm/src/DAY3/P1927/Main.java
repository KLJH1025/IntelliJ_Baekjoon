package DAY3.P1927;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static ArrayList<Integer> arr;

    public static void main(String[] args) throws Exception{

        arr = new ArrayList<>();
        arr.add(-1);

        System.setIn(new FileInputStream("src/DAY3/P1927/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());

            if(input == 0 && arr.size() == 1){
                System.out.println(0);
            }
            else if ( input == 0 && arr.size() > 1){
                int temp = arr.get(1);
                System.out.println(temp);

                //추가 정렬
                arr.set(input, 1);
                int tempIdx = 1;

                while(true){
                    if(tempIdx*2 > arr.size()-1){
                        break;
                    }

                    if(arr.get(tempIdx) > arr.get(tempIdx*2)){
                        int a = arr.get(tempIdx);
                        int b = arr.get(tempIdx*2);
                        arr.set(tempIdx, b);
                        arr.set(tempIdx*2, a);
                        tempIdx = tempIdx*2;
                    }
                    else if (arr.get(tempIdx) > arr.get(tempIdx*2+1)){
                        int a = arr.get(tempIdx);
                        int b = arr.get(tempIdx*2+1);
                        arr.set(tempIdx, b);
                        arr.set(tempIdx*2, a);
                        tempIdx = tempIdx*2 + 1;
                    }

                }

            }
            else if ( input > 0 ){
                arr.add(input);
                //추가 정렬
                int temp = arr.size() - 1;
                while(temp != 1){
                    int a = arr.get(temp);
                    int temp2 = temp/2;
                    int b = arr.get(temp2);

                    if(a < b){
                        arr.set(temp, b);
                        arr.set(temp2, a);
                    }
                    temp = temp/2;
                }
            }

        }

        for(int i=1; i<arr.size(); i++){
            System.out.print(arr.get(i));
        }

    }

}
