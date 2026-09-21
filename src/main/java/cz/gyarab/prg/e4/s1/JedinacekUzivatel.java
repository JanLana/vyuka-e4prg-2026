package cz.gyarab.prg.e4.s1;

import java.util.jar.JarEntry;

public class JedinacekUzivatel {
    public String jmeno;
    public int vek;

    @Override
    public String toString() {
        return "JedinacekUzivatel{" +
                "jmeno='" + jmeno + '\'' +
                ", vek=" + vek +
                '}';
    }

    private static JedinacekUzivatel singletonInstance;
    private JedinacekUzivatel() { }

    public static JedinacekUzivatel getInstance() {
        if (null == singletonInstance) {
            singletonInstance = new JedinacekUzivatel();
        }
        return singletonInstance;
    }
}
