package cz.gyarab.prg.e4.s2.hodina08;

public class TovarnaNaJidlo {
    public static Jidlo vyrobJidlo(String jmeno) {
        if (jmeno.equals("dort")) {
            return new Dort();
        } else if (jmeno.equals("pivo")) {
            return new Pivo();
        } else if (jmeno.equals("caj") || jmeno.equals("cerny caj")) {
            return new Caj("cerny");
        } else if (jmeno.equals("zeleny caj")) {
            return new Caj("zeleny");
        } else {
            throw new IllegalArgumentException("nezname jidlo " + jmeno);
        }
    }
}
