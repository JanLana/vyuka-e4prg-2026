package cz.gyarab.prg.e4.s1.hodina08;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Jidlo> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(;;) {
            String jmenoJidla = sc.nextLine();
            if (jmenoJidla.equals("konec")) {
                break;
            }

            Jidlo j = TovarnaNaJidlo.vyrobJidlo(jmenoJidla);
            arr.add(j);
        }

        int celkovaCena = 0;
        for(Jidlo j : arr) {
            System.out.println(j.vyrobTo());
            celkovaCena += j.dejCenu();
        }
        System.out.println("celkova cena: " + celkovaCena);
    }
}
