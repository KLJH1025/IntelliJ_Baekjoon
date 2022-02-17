package Level12_sort.P1181;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws Exception {

        System.setIn(new FileInputStream("src/Level12_sort/P1181/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        HashSet<String> hashList = new HashSet<>();

        for(int i=0; i<N; i++){
            String a = br.readLine();
            hashList.add(a);
        }

        List<String> kkk = hashList.stream().collect(Collectors.toList());

        Collections.sort(kkk, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() != o2.length()){
                    return o1.length() - o2.length();
                }
                else{
                    for(int i=0; i<o1.length(); i++){
                        if(o1.charAt(i) != o2.charAt(i))
                            return o1.charAt(i) - o2.charAt(i);
                    }
                }
                return 0;
            }
        });

        for(String tmp : kkk)
            System.out.println(tmp);

    }
}


