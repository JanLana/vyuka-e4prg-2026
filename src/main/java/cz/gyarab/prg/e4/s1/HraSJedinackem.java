package cz.gyarab.prg.e4.s1;

public class HraSJedinackem {
    public void vypisNadpis() {
        JedinacekUzivatel u =
                //new JedinacekUzivatel();
                JedinacekUzivatel.getInstance();

        System.out.println("=== " + u.jmeno + "===");
    }

    static void main() {
        JedinacekUzivatel uzivatel =
                //new JedinacekUzivatel();
                JedinacekUzivatel.getInstance();

        uzivatel.jmeno = "Jan";
        uzivatel.vek = 13;

        System.out.println(uzivatel);

        HraSJedinackem j = new HraSJedinackem();
        j.vypisNadpis();
    }
}
