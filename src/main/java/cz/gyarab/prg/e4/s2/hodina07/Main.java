package cz.gyarab.prg.e4.s2.hodina07;

import java.util.Iterator;

public class Main {
    static void main() {
        PrvocislaDo p = new PrvocislaDo(10);

       /* Iterator<Integer> it = p.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }*/

        System.out.println("prvocisla poprve");
        for(int i: p) {
            for(int j: p) {
                System.out.println(i + " - " + j);
            }
        }
    }
}
