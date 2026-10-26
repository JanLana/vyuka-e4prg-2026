package cz.gyarab.prg.e4.s1.hodina07;

import java.util.Iterator;

public class Main {
    static void main() {
        Prvocisla prvocislaDo10 = new Prvocisla(21);

        /*Iterator<Integer> it = prvocislaDo10.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }*/
        for(int i : prvocislaDo10) {
            for (int j : prvocislaDo10) {
                System.out.println(i + " - " + j);
            }

        }
    }
}
