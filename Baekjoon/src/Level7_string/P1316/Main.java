package Level7_string.P1316;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/Level7_string/P1316/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=0; i<N; i++){
            String a = br.readLine();

            int len = a.length();

            ArrayList<Character> list = new ArrayList<>();

            list.add(a.charAt(0));
            int flag = 0;
            for(int j=1; j<len; j++){
                if(a.charAt(j) == a.charAt(j-1)){
                    //이전 단어와 같은 단어 중복해서 나옴
                    continue;
                }
                else{
                    if(list.contains(a.charAt(j))){
                        //단어가 연속되지 않음 -> 이미 앞에서 나온 단어 -> 그룹단어 아님
                        flag = 1;
                        break;
                    }
                    else{
                        //단어 연속되지 않음 -> 새로운 단어
                        list.add(a.charAt(j));
                        continue;
                    }
                }
            }

            if(flag == 0){
                count++;
            }

        }

        System.out.println(count);

    }

}
