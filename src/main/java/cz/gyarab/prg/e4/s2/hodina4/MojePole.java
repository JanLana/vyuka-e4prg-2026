package cz.gyarab.prg.e4.s2.hodina4;

public class MojePole {
    String[] arr = new String[10];

    Logger log = Logger.getInstance();

    public void add(String str) {
        log.debug("pridava " + str);
    }

    public String get(int index) {
        log.debug("get " + index);

        return arr[index];
    }

}
