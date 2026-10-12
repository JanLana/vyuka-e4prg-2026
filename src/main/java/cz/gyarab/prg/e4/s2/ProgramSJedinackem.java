package cz.gyarab.prg.e4.s2;

public class ProgramSJedinackem {

    public void vypisUzivatele() {
        KonfiguraceJedinacek k =
                KonfiguraceJedinacek.getInstance();

        System.out.println(k.jmenoUzivatele);
    }

    static void main() {
        KonfiguraceJedinacek konfigurace =
                //new KonfiguraceJedinacek();
                KonfiguraceJedinacek.getInstance();

        konfigurace.jmenoUzivatele = "pepa";
        konfigurace.vekUzivatele = 17;
        konfigurace.trida = "3.A";

        ProgramSJedinackem p = new ProgramSJedinackem();

        p.vypisUzivatele();
    }
}
