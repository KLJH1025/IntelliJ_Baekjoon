package DAY1.P1713;

import java.io.FileInputStream;
import java.util.*;

public class Main_Teacher {

    static int N, K;
    static Person[] people;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/DAY1/P1713/input.txt"));
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();

        people = new Person[101]; // 0~100번 인덱스..0번 인덱스는 사용X

        List<Person> list = new ArrayList<>();
        for(int k=0; k<K; k++){
            int num = sc.nextInt();
            if(people[num] == null){
                people[num] = new Person(num, 0,0, false);
            }
            //사진판에 있는 경우 -> count++
            if(people[num].isIn == true){
                people[num].count++;
            }
            else{ //사진판에 없는 경우 -> (후보중 하나 골라서, 제거 후,) 새 후보 추가
                if(list.size() == N){
                    Collections.sort(list);
                    Person p = list.remove(0);
                    p.isIn = false;
                }
                people[num].count = 1;
                people[num].isIn = true;
                people[num].timeStamp = k;
                list.add(people[num]);
            }
        }

        Collections.sort(list, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.num, o2.num);
            }
        });

        for(Person pp : list){
            System.out.print(pp.num + " ");
        }
    }
}

class Person implements Comparable<Person>{
    int num;
    int count;
    int timeStamp;
    boolean isIn;

    public Person(int num, int count, int timeStamp, boolean isIn) {
        this.num = num;
        this.count = count;
        this.timeStamp = timeStamp;
        this.isIn = isIn;
    }

    @Override
    public String toString() {
        return "{" +
                "num=" + num +
                ", count=" + count +
                ", timeStamp=" + timeStamp +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        int comp1 = Integer.compare(this.count, o.count);
        if(comp1 == 0){
            return Integer.compare(this.timeStamp, o.timeStamp);
        }
        else{
            return comp1;
        }
    }

}
