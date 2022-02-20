package Level12_sort.P18870;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception{

        System.setIn(new FileInputStream("src/Level12_sort/P18870/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        int[] sortArr = new int[N];

        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
            sortArr[i] = temp;
        }

        Arrays.sort(sortArr);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 0;

        for(int i=0; i<N; i++){
            if(!map.containsKey(sortArr[i])){
               map.put(sortArr[i], rank);
               rank++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            sb.append(map.get(arr[i])).append(" ");
        }

        System.out.println(sb);

    }

}
