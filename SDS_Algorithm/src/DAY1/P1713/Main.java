package DAY1.P1713;

import java.io.FileInputStream;
import java.util.*;

public class Main {

    static int N;
    static int length;
    static ArrayList<Participate> par;
    static Participate[] array;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/DAY1/P1713/input.txt"));
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        par = new ArrayList<>();
        length = sc.nextInt();
        array = new Participate[length];

        for (int i = 0; i < length; i++) {
            array[i] = new Participate(sc.nextInt(), i);
        }

        for (int i = 0; i < length; i++) { //투표수를 반영한다.
            if (par.size() < N) { //후보 자리가 남았다면
                int flag = 0;  //이미 등록된 후보의 표라면 +1
                for (int j = 0; j < par.size(); j++) {
                    if (par.get(j).number == array[i].number) {
                        par.get(j).count += 1;
                        flag = 1;
                    }
                }
                if (flag == 0) //신규 후보자라면 그냥 등록
                    par.add(array[i]);
            } else {
                int flag = 0;  //이미 등록된 후보의 표라면 +1
                for (int j = 0; j < par.size(); j++) {
                    if (par.get(j).number == array[i].number) {
                        par.get(j).count += 1;
                        flag = 1;
                    }
                }
                if (flag == 0) {
                    Collections.sort(par);
                    /*for (int k = 0; k < par.size(); k++) {
                        System.out.print(par.get(k).number);
                        System.out.print(" ");
                    }*/
                    par.remove(0);
                    par.add(array[i]);
                }
            }

        }

        Collections.sort(par,new Comparator<Participate>(){

            @Override
            public int compare(Participate o1, Participate o2) {
                if(o1.number > o2.number){
                    return 1;
                }
                else
                    return -1;
            }
        });

        for(int k = 0; k<par.size(); k++){
            System.out.print(par.get(k).number);
            System.out.print(" ");
        }


        /*for (int i = 0; i < par.size(); i++) {
            System.out.print(par.get(i).number);
            System.out.print(" ");
        }*/

    }
}

class Participate implements Comparable<Participate> {
    int number;
    int count = 1;
    int order;

    public Participate(int number, int order) {
        this.number = number;
        this.order = order;
    }

    @Override
    public int compareTo(Participate o) {
        if (this.count > o.count) {
            return 1;
        } else if (this.count < o.count) {
            return -1;
        } else {
            if (this.order > o.order) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}

