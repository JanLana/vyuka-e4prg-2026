package cz.gyarab.prg.e4.s1.hodina4;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("ucitel");
        arr.add("danovy poplatnik");


        MujUzivatel ja = new MujUzivatel(1, "Jan", arr);

        System.out.println(ja);

        arr.add("reditel sveta");
        ja.getRole().add("reditel sveta");

        System.out.println(ja);
    }
}
