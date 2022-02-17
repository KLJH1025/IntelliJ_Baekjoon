package Level12_sort.P10814;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int ORDER = 1;

    public static void main(String[] args) throws Exception {

        System.setIn(new FileInputStream("src/Level12_sort/P10814/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Person> list = new ArrayList<>();

        StringTokenizer st;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            list.add(new Person(age, name, ORDER++));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        for(Person p : list){
            sb.append(p).append('\n');
        }
        System.out.println(sb);

    }
}

class Person implements Comparable<Person>{

    int order;
    int age;
    String name;

    Person(int age, String name, int order){
        this.age = age;
        this.name = name;
        this.order = order;
    }

    @Override
    public int compareTo(Person o) {
        if(this.age == o.age){
            return this.order - o.order;
        }
        return this.age - o.age;
    }

    @Override
    public String toString(){
        return this.age + " " + this.name;
    }
}
