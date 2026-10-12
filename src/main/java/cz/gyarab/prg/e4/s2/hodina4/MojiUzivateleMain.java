package cz.gyarab.prg.e4.s2.hodina4;

import java.util.ArrayList;

public class MojiUzivateleMain {
    static void main() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("ucitel");
        arr.add("otec");

        UserAccount a = new UserAccount(1, "Jan", arr);

        System.out.println(a);
        System.out.println(a.getJméno());

        arr.add("buh");

        System.out.println(a);


    }
}
