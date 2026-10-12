package cz.gyarab.prg.e4.s1;

public class ProgramSMujArray {

    static void main() {
        MujArrayList arr = new MujArrayList();

        Logger log = Logger.getInstance();

        log.debug("pred krokem 1");
        arr.add("prvni polozka");

        log.debug("pred krokem 2");
        System.out.println(arr.get(1));

        log.debug("pred krokem 3");
    }

}
