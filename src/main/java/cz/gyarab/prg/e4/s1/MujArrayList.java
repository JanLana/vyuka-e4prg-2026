package cz.gyarab.prg.e4.s1;

public class MujArrayList {
    String[] arr = new String[10];

    Logger log = Logger.getInstance();

    public void add(String s) {
        log.debug("pridavam s" + s);
    }

    public String get(int index) {
        log.debug("beru index" + index);
        return arr[index];
    }
}
