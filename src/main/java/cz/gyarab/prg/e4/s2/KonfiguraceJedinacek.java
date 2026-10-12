package cz.gyarab.prg.e4.s2;

public class KonfiguraceJedinacek {

    private static KonfiguraceJedinacek singletonInstance;

    private KonfiguraceJedinacek() { }

    public static KonfiguraceJedinacek getInstance() {
        if (null == singletonInstance) {
            singletonInstance = new KonfiguraceJedinacek();
        }
        return singletonInstance;
    }

    public String jmenoUzivatele;
    public int vekUzivatele;
    public String trida;
}
