package cz.gyarab.prg.e4.s2.hodina08;

import java.util.ArrayList;
import java.util.Scanner;

public class Mai {
    static void main() {
        ArrayList<Jidlo> seznamJidel = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(;;) {
            String jmenoJidla = sc.nextLine();
            if (jmenoJidla.equals("konec")) {
                break;
            }

            Jidlo j = TovarnaNaJidlo.vyrobJidlo(jmenoJidla);
            seznamJidel.add(j);
        }

        for(Jidlo x : seznamJidel) {
            System.out.println(x.vyrobTo());
        }

    }
}
