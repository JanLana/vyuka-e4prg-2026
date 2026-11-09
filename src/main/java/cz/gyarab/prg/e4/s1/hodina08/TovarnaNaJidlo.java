package cz.gyarab.prg.e4.s1.hodina08;

public class TovarnaNaJidlo {
    public static Jidlo vyrobJidlo(String jmeno) {
        if (jmeno.equals("dort")) {
            return new Dort();
        } else if (jmeno.equals("pivo")) {
            return new Pivo(500);
        } else if (jmeno.equals("male pivo")) {
            return new Pivo(300);
        } else if (jmeno.equals("cerny caj")) {
            return new Caj("cerny");
        } else if (jmeno.equals("ovocny caj")) {
            return new Caj("ovocny");
        }  else {
            throw new IllegalArgumentException("Nezname jidlo.");
        }
    }
}
