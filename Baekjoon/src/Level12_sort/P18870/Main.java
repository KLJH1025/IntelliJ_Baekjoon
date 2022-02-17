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

        HashSet<Integer> hashset = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> array = new ArrayList<>();

        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(st.nextToken());
            array.add(temp);
            hashset.add(temp);
        }

        List<Integer> list = hashset.stream().collect(Collectors.toList());

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for(int k : array){
            sb.append((list.indexOf(k))).append(" ");
        }

        System.out.println(sb);

    }

}
